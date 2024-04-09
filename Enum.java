// In Java, an enum (short for "enumeration") is a special data type used to define a set of named constants. Enums provide a way to represent a fixed set of predefined values, making the code more readable, maintainable, and type-safe.

enum Status{
    Running, Pending, Failed, Success
};


public class Enum {
    public static void main(String args[]){
        Status s = Status.Failed;
        System.out.println(s);
        // System.out.println(s.ordinal()); //Returns the Index value
        Status[] ss = Status.values(); //Returns the Entire array of the Enum
        for(Status r : ss){
            System.out.println(r);
        }

    }
}
