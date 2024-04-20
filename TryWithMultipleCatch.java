public class TryWithMultipleCatch {
    public static void main(String args[]){
        int nums[] = new int[5];
        int i = 2;
        int j = 0;
        String str = null;
        try{
            j = 18/i;
            System.out.println(str.length());
            // System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Limit of the array is crossed");
        }
        catch(Exception e){
            System.out.println("Something went wrong. " + e);
        }
        System.out.println(j);
        System.out.println("Execution Completed");
    }
}
