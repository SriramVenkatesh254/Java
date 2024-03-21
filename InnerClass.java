// An inner class in Java is a class defined within another class. It's a way to logically group classes that are only used in one place, which can make the code more readable and maintainable. Inner classes have access to the members (fields and methods) of the outer class, including private members.

class Outer {
    private int outerField = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class accessing outerField: " + outerField);
        }
    }
}

public class InnerClass{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // Creating an instance of the inner class
        inner.display(); // Accessing the method of the inner class

        //Breakdown of the syntax Outer.Inner inner = outer.new Inner();

        // Outer.Inner: This part declares the type of the variable inner to be an instance of the inner class Inner declared within the Outer class. This is similar to declaring any other variable type.

        // inner: This is the name of the variable that will hold the reference to the newly created instance of the inner class.

        // outer.new Inner(): This expression creates a new instance of the inner class Inner within the context of the outer class outer. The new keyword is used to create a new instance, and outer is an instance of the outer class used to access the inner class.

        // Putting it all together, Outer.Inner inner = outer.new Inner(); creates a new instance of the inner class Inner associated with the outer class instance outer, and assigns this instance to the variable inner.

        //Breakdown of the syntax, outer.new Inner()
        //Here's a breakdown of what each part means:

        // outer: This refers to an instance of the outer class. In this context, outer is an instance of the Outer class.

        // .new: This is a keyword used to create a new instance of a non-static inner class.

        // Inner(): This is the constructor of the inner class. By using outer.new Inner(), you are creating a new instance of the inner class Inner that is associated with the instance of the outer class outer.
        
        // So, outer.new Inner() is a way to instantiate an object of the inner class within the context of the outer class. It's necessary to have an instance of the outer class to create an instance of the inner class because an inner class is associated with an instance of the outer class.
    }
}