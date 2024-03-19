// Polymorphism in Java refers to the ability of a single method, class, or interface to take on multiple forms. In Java, there are two main types of polymorphism: compile-time polymorphism (also known as method overloading) and runtime polymorphism (also known as method overriding).

public class CompiletimePolymorphism {
    public void printMessage() {
        System.out.println("No parameter method");
    }

    public void printMessage(String message) {
        System.out.println("Parameter method: " + message);
    }

    public static void main(String args[]){
        CompiletimePolymorphism obj = new CompiletimePolymorphism();
        obj.printMessage(); //No parameter method
        obj.printMessage("Sriram"); //With parameter
    }
}

