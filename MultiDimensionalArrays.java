class Demo{
    public static void main(String a[]){
        int nums[][] = new int[3][4];

        //Inserting values into the array
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
            System.out.println();
        }

        //Printing the values of array using Normal forLoop
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        } 

        //Printing the values of array using Enhanced forLoop
        for(int i[]:nums){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}