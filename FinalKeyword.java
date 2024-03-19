// In Java, the final keyword is a modifier that can be applied to variables, methods, and classes, with different meanings in each context. Here's a brief explanation of its usage:

// 1. Final Variables:
// When applied to a variable, the final keyword indicates that the variable's value cannot be changed once assigned. It essentially makes the variable a constant.

// 2. Final Methods:
// When applied to a method, the final keyword indicates that the method cannot be overridden by subclasses. It effectively prevents subclasses from changing the behavior of the method.

//3. Final Classes:
//When applied to a class, the final keyword indicates that the class cannot be subclassed. It prevents other classes from extending it.


//Final Methods
// class Computer{
//     public final void show(){
//         System.out.println("Inside the Computer class");
//     }
// }

// class Laptop extends Computer{
//     public void show(){
//         System.out.println("Inside the Laptop class");
//     }
// }

//Final class
// final class A{

// }
// class B extends A{ //It cannot be Subclassed because the class A is final. 

// }

public class FinalKeyword {
    public static void main(String args[]){
        //Final Variables
        // final int variable = 10;
        // variable = 15; 
        // System.out.println(variable); //Error (Final Keyword)

        // Computer obj = new Computer();
        // obj.show();

        // Computer obj1 = new Laptop();
        // obj1.show();
    }    
}





















