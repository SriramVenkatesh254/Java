class Person{
    String fullName;
    int currentAge;

    public Person(String fullName, int currentAge){
        this.fullName = fullName;
        this.currentAge = currentAge;
    }

    public void display(){
        System.out.println("Name: " + fullName + " & " + "Age: " + currentAge);
    }
}

public class anonymousObject {
    //Anonymous Object -> In Java, an anonymous object is an object that is created without giving it a name. Anonymous objects are often used to create objects on the fly and pass them as arguments to methods. Here is an example of how to create and use an anonymous object in Java.
    
    public static void main(String args[]){
        new Person("Mahendra Singh Dhoni ", 42).display();
    }
}
