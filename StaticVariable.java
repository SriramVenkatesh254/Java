class Human{
    String name;
    String homeTown;
    static String language;

    //Static Variables -> If we make a variable static, it becomes a part of the class and not the object. This static variable will be common to all the classes and if we change the value of this static variable, All the values will be changed.

    public void showDetails(){
        System.out.println(name + " : " + homeTown + " : " + language); //NOTE: Non static methods can have static variables.
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
        obj2.homeTown = "Trichy";
        // Human.language = "Tamil";

        Human.language = "Telugu";

        obj.showDetails();
        obj2.showDetails();
    }
}
