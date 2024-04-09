//Using CLASS AND OBJECTS.

// abstract class Computer{
//     public abstract void code();
// }

// class Laptop extends Computer{
//     public void code(){
//         System.out.println("Code, Compile, Run...");
//     }
// }

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("Code, Compile, Run : Faster");
//     }
// }

// class Developer{
//     public void devApp(Computer computer){
//         computer.code();
//     }
// }

// public class Interface {
//     public static void main(String args[]){
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//         Developer sriram = new Developer();
//         sriram.devApp(lap);
//     }
// }

//Using INTERFACES.
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}

public class Interface {
    public static void main(String args[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer sriram = new Developer();
        sriram.devApp(lap);
        sriram.devApp(desk);
    }
}