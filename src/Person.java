public class Person {
    String name;
    int amountOfGroceries;
    int value;

    public Person() {
    }

    public Person(String name, int amountOfGroceries, int value) {
        this.name = name;
        this.amountOfGroceries = amountOfGroceries;
        this.value = value;
    }

    public void setNames(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAmountOfGroceries(int amountOfGroceries){
        this.amountOfGroceries = amountOfGroceries;
    }

    public int getAmountOfGroceries(){
        return amountOfGroceries;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
