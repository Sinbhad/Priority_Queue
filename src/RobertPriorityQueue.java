import lib.RobertCircularlyLinkedList;

//much like in a deck, a stacks last added element is the first out LIFO

//in a queue the first in is the first out

//priority queue, add method will check based on status and either move to head
//or tail
@SuppressWarnings("unchecked")
public class RobertPriorityQueue<T> {
    private Person person;
    private int size;
    private RobertCircularlyLinkedList<Person> people;

    public RobertPriorityQueue(){
        people = new RobertCircularlyLinkedList<>();
        size = 0;
    }

    public void add(T person){
        Person p = (Person) person;

        //checks data's value attribute to determine where in the queue it should be added
        if(p.getValue() == 1){
            people.addAtIndex(0, p);
            size++;
        }else{
            people.add(p);
            size++;
        }
    }

    public T peek(){
        if(people.getValAtIndex(0) == null){
            return null;
        }
        return (T) people.getValAtIndex(0);
    }

    public T poll(){
        //the data in front is taken care of, the rest moves back
        T value = peek();
        if(value != null){
            people.removeAt(0);
            size--;
        }
        return value;
    }

    public Boolean find(Person person){
        if(!people.find(person)){
            return false;
        }
        return true;
    }

    public void insert(Person person, int index){
        people.addAtIndex(index, person);
    }

    public void printLine(Person person){
        people.printAll();
    }
}
