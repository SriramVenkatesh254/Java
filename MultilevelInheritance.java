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

class C extends B{
    public void method5(){
        System.out.println("Method 5");
    }

    public void method6(){
        System.out.println("Method 6");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]){
        C obj1 = new C();
        obj1.method1();
        obj1.method2(); //Both are from Class A

        obj1.method3();
        obj1.method4(); //Both are from Class B 

        obj1.method5();
        obj1.method6(); //Both are from Class C

        //So, basically, Class B inherits Class A. So, class B will have all the properties and methods from Class A. Similarly, class C inherits Class B. So now, Class C will have both the properties of Class A and Class B as well. This is called, Multilevel Inheritance.
    }
}
