class A{
    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }
}

class B extends A{
    public void method3(){
        System.out.println("Method 3");
    }

    public void method4(){
        System.out.println("Method 4");
    }
}

public class Inheritance {
    public static void main(String args[]){
        B obj1 = new B();
        obj1.method3(); //Which is in the Class B itself
        obj1.method1(); //Which is inside the class A (Inherited)
    }   
}
