class Sathyabama{
    String regNo;
    String name;
    static String department = "Electronics and communication Engineering";

    //Non-static method
    public void show(){
        System.out.println(regNo + " : " + name + " : " + department);
    }

    //Static Method
    public static void show(Sathyabama obj){
        System.out.println(obj.regNo + " : " + obj.name + " : " + department);
        //Non-static variables cannot be accessed in static methods directly. But, we can do it Indierctly with the object reference.
    }
}

public class StaticMethod{
    public static void main(String args[]){
        Sathyabama obj1 = new Sathyabama();
        obj1.regNo = "42130475";
        obj1.name = "Sriram";
        obj1.show();

        Sathyabama obj2 = new Sathyabama();
        obj2.regNo = "42130501";
        obj2.name = "Thiru";
        obj2.show();

        //Accessing the static method.
        Sathyabama.show(obj2); //Static methods are accessed in a static way. (ie, using the class and not the reference variable)
    }
}