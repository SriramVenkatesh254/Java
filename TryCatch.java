public class TryCatch {
    public static void main(String args[]){
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            // int x[] = new int[5];
            // x[6] = 15;

            
        }
        catch(Exception e){
            System.out.println("OOPS!, Something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
        
    }
}
