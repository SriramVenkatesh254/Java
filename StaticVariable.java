
// In Java, a static variable (also known as a class variable) is a variable that belongs to the class itself, rather than to instances (objects) of the class. This means that there is only one copy of the static variable shared among all instances of the class. Static variables are declared using the static keyword.

class Human{
    String name;
    String homeTown;
    static String language;

    public void showDetails(){
        System.out.println(name + " : " + homeTown + " : " + language); //NOTE: Non static methods can have static variables, in them
    }
}

public class StaticVariable {
    public static void main(String args[]){
        Human obj = new Human();
        obj.name = "Sriram";
        obj.homeTown = "Madurai";
        // Human.language = "Tamil";

        Human obj2 = new Human();
        obj2.name = "Harish";
        obj2.homeTown = "Salem";
        // Human.language = "Tamil";

        Human.language = "Telugu";
        //The static variable, Language becomes the part of the class. Hence, it is called using the Class and not the Instance.

        obj.showDetails();
        obj2.showDetails();
    }
}
