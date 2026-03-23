void main(){
    RobertPriorityQueue<Person> priorityQueue = new RobertPriorityQueue<>();
    Person rob = new Person("Rob", 10, 2);
    Person westley = new Person("Westley", 8, 1);

    priorityQueue.add(rob);
    System.out.println(priorityQueue.peek().getName());
    priorityQueue.add(westley);
    System.out.println(priorityQueue.peek().getName());
}