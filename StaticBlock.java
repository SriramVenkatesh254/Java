class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "SmartPhone";
        System.out.println("Inside Static Block");
        //The static block will get initialised only once irrespective of how many objects are created. The static block will be called only once.
    }

    public Mobile(){ //Constructor -> A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
        brand = "Samsung";
        price = 1000;
        System.out.println("In Constructor");
        //The constructor will get initialised each and every time an object is created.
    }
}

public class StaticBlock {
    public static void main(String a[]) throws ClassNotFoundException{
        Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        // System.out.println("Inside Object 1");

        Mobile obj2 = new Mobile();
        // System.out.println("Inside object 2");
    }
}
