import java.util.Scanner;
public class ScannerInput {
    public static void main(String args[]){
        System.out.print("Enter your name: ");
        try (Scanner obj = new Scanner(System.in)) {
            String name = obj.next();

            System.out.println("What is your age: ");
            int age = obj.nextInt();

            if(age >= 18){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You are not eligible to vote");
            }
        }
    }
}
