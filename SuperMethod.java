//super() will execute the constructor of the parent class or the superclass.

class A{
    A(){
        super();
        System.out.println("Inside class A's constructor");
    }
    A(int x){
        super();
        System.out.println("Inside class A's param constructor"); //this
    }
}

class B extends A{
    B(){
        super(5);
        System.out.println("Inside class B's constructor"); //this
    }

    B(int x){
        super();
        System.out.println("Inside class B's param constructor");
    }
}

public class SuperMethod{
    public static void main(String args[]){
        // B obj = new B(5);
        B obj = new B();
    }
}