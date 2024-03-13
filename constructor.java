//In Java, a Constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
class Geeks{
    String firstName;
    int age;

    //Default Contructor
    public Geeks(){
        firstName = "Sriram";  
        age = 18;
        System.out.println("Inside Constructor");

        //Constructor will be called everytime when an instance of a class (Object) is created to initialise the instance variables.
    }

    //Parameterized Constructor (or) Constructor overloading

    public Geeks(int age, String firstName){
        this.age = age;
        this.firstName = firstName;
    }

    public Geeks(int age){
        this.age = age;
        firstName = "Ajith";
    }

    public Geeks(String firstName){
        this.firstName = firstName;
        age = 45;
    }
}

public class constructor {
    public static void main(String args[]){

        //Default Constructor
        Geeks obj1 = new Geeks();
        System.out.println(obj1.firstName);

        //Paramterized Constructor (firstName alone)
        Geeks obj2 = new Geeks("Mahendra");
        System.out.println(obj2.firstName);

        //Parameterized Constructor (both firstName and age)
        Geeks obj3 = new Geeks(52,"Ajith");
        System.out.println(obj3.firstName + " : " + obj3.age);

        
        Geeks obj4 = new Geeks(79);
        System.out.println(obj4.firstName + " : " + obj4.age);

        Geeks obj5 = new Geeks("AR Rahman");
        System.out.println(obj5.firstName + " : " + obj5.age);
    }
}
