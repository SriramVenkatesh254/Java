// In Java, access modifiers are keywords used to control the visibility or accessibility of classes, variables, methods, and constructors. There are four access modifiers in Java:

// public: The public access modifier allows unrestricted access from any other class or package. Public members are accessible from anywhere.

// protected: The protected access modifier allows access within the same package and by subclasses (even if they are in different packages). Protected members are not accessible to unrelated classes outside the package hierarchy.

// default (no modifier): If no access modifier is specified, the default access modifier is applied. Members with default access are accessible within the same package but not from outside the package.

// private: The private access modifier restricts access to only within the same class. Private members are not accessible outside the class, even in subclasses or within the same package.


public class AccessModifiers {
    public int publicVar;
    protected int protectedVar;
    int defaultVar; // Default access
    private int privateVar;
    
    public void publicMethod() {
        // Code accessible from anywhere
    }
    
    protected void protectedMethod() {
        // Code accessible within the same package and by subclasses
    }
    
    void defaultMethod() {
        // Code accessible within the same package
    }
    
    private void privateMethod() {
        // Code accessible only within the same class
    }
}
