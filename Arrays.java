class Arrays{
    public static void main(String a[]){
        int array[] = {1,2,3}; //Array creation if we know the values before.
        int nums[] = new int[5]; //Array creation if we don't know the values but the size
        nums[0] = 5; //Assigning values to the array using index. 
        nums[1] = 10; 
        // System.out.println(nums[1]); //printing the values of arrays using index
        array[0] = 11;
        // System.out.println(array[0]);
        int phoneNumbers[] = {123,456,784};
        for(int i = 0; i <=2; i++){
            System.out.println(phoneNumbers[i]);
        }
    }
}