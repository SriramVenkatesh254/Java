// An inner class in Java is a class defined within another class. It's a way to logically group classes that are only used in one place, which can make the code more readable and maintainable. Inner classes have access to the members (fields and methods) of the outer class, including private members.

class Outer {
    private int outerVar = 10;

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Value of outerVar: " + outerVar);
        }
    }

    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Static nested class");
        }
    }

    // Method with Local Inner Class
    void methodWithLocalInner() {
        int localVar = 20;
        class LocalInner {
            void display() {
                System.out.println("Value of localVar: " + localVar);
            }
        }
        LocalInner inner = new LocalInner();
        inner.display();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Member Inner Class
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Static Nested Class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();

        // Method with Local Inner Class
        outer.methodWithLocalInner();
    }
}
