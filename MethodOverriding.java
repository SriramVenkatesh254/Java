//Method OverRiding -> Method overriding in Java is a concept where a subclass provides a specific implementation of a method that is already defined in its superclass. This allows a subclass to provide its own version of a method that overrides the behavior of the method in the superclass.

class A{
    public void show(){
        System.out.println("In A Show");
    }

    public void config(){
        System.out.println("In A config");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.config();
    }
}
