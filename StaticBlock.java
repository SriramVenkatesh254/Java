class Mobile{

    static{
        System.out.println("Inside Static Block");
        //The static block will get initialised only once irrespective of how many objects are created. The static block will be called only once.
    }

    public Mobile(){ 
        //Constructor -> A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
        System.out.println("Inside the Constructor");
        //The constructor will get initialised each and every time an object is created.
    }
}

public class StaticBlock {
    public static void main(String a[]) throws ClassNotFoundException{
        Class.forName("Mobile");
        //Class will get loaded only once and only when the object is created. But, if we need to load class without creating an object, This is the way. (Class.forName())

        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
    }
}
