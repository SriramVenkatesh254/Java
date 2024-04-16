public class TryCatch {
    public static void main(String args[]){
        // int i = 0;
        // int j = 0;

        try{
            // j = 9/i;
            int x[] = new int[5];
            x[6] = 15;

            
        }
        catch(ArithmeticException e){
            System.out.println("OOPS!, Something went wrong " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Too much length");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");
        
    }
}
