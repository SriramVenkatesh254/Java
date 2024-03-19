// Polymorphism in Java refers to the ability of a single method, class, or interface to take on multiple forms. In Java, there are two main types of polymorphism: compile-time polymorphism (also known as method overloading) and runtime polymorphism (also known as method overriding).

// Runtime Polymorphism (Method Overriding):
// This occurs when a method in a subclass has the same name, return type, and parameters as a method in its superclass. At runtime, the method in the subclass overrides the method in the superclass.

class Computer{
    public void show(){
        System.out.println("Inside the Computer class");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("Inside the Laptop class");
    }
}

class Mobile extends Computer{
    public void show(){
        System.out.println("Inside the Mobile class");
    }
}

public class RuntimePolymorphism {
    public static void main(String args[]){
        Computer obj = new Laptop(); //Upcasting.
        Computer obj1 = new Mobile(); //Upcasting.
        obj.show(); 
        obj1.show();

        // In the RuntimePolymorphism class, we create instances of Laptop and Mobile and assign them to variables of type Computer. This is possible due to polymorphism (upcasting).
        // When we call the show() method on these objects, the JVM dynamically decides which version of the method to execute based on the actual type of the object (not the reference type). This is runtime polymorphism. So, Laptop.show() outputs "Inside the Laptop class", and Mobile.show() outputs "Inside the Mobile class".
    }
}
