//this() will execute the constructor of the same class.

class A{
    A(){
        System.out.println("Inside class A's constructor");
    }
    A(int x){
        System.out.println("Inside class A's param constructor"); //this
    }
}

class B extends A{
    B(){
        System.out.println("Inside class B's constructor"); //this
    }

    B(int x){
        this();
        System.out.println("Inside class B's param constructor");
    }
}

public class ThisMethod{
    public static void main(String args[]){
        // B obj = new B(5);
        B obj = new B(5);
    }
}