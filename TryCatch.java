public class TryCatch {
    public static void main(String args[]){
        int i = 0;
        int j = 0;

        try{
            j = 9/i;
            
        }
        catch(ArithmeticException e){
            System.out.println("OOPS!, Something went wrong " + e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");
        
    }
}
