class Human{
    String name;
    String homeTown;
    static String language;

    public void showDetails(){
        System.out.println(name + " : " + homeTown + " : " + language); 
    }

    public static void showDetails1(Human obj){
        System.out.println(obj.name + " : " + obj.homeTown + " : " + language); //Non static varibles cannot be used in static methods diretclty without object reference. We can do it indiretcly only with the object reference.
    }
}

public class StaticMethod {
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
        Human.showDetails1(obj);
    }
}