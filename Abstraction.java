// Abstraction --> Abstraction in Java is like using a TV remote without knowing how it works inside. You press the buttons to change channels or adjust volume without needing to understand the intricate electronics inside. Similarly, in programming, abstraction lets you use complex systems by hiding their inner workings and providing a simplified interface. You focus on what things do, not how they do it.

// RULES

// 1. The class must have the abstract keyword
// 2. The abstract class can have abstract methods and concrete  methods as well or only one of them.
// 3. The abstract method should have the abstract keyword.
// 4. YOU CANNOT CREATE AN INSTANCE OF AN ABSTRACT CLASS. (Use upcasting)


//Abstract class
abstract class Computer{
    //Abstract method
    abstract void mobility();
}
//you cannot create an instance of a Abstract class. You can only create an instance of a concrete class.

//Concrete class implementing the abstract class
class Laptop extends Computer{

    //Implementation of the mobility method
    public void mobility(){
        System.out.println("Inside Mobility method of a Laptop class.");
    }
}

//Main class
public class Abstraction {
    public static void main(String args[]){
        //Creating an object of a concrete class.
        Computer obj = new Laptop(); //Upcasting.
        obj.mobility();
    }
}
