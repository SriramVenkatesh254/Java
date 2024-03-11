public class EnhancedForLoop {
    public static void main(String a[]){
        int nums[] = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        //Normal For Loop
        // for(int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        //Using Enhanced ForLoop
        for(int i: nums){
            System.out.println(i);
        }
    }
}
