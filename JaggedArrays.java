public class JaggedArrays {
    public static void main(String a[]){

        //Jagged Arrays -> Where we keep the number of rows fixed and the number of columns can be varied.
        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        //Inserting values into the array
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
            System.out.println();
        }

        //Printing the values of array using Normal forLoop.
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        } 

        //Printing the values of arrays using an Enhanced forLoop
        for(int i[] : nums){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
