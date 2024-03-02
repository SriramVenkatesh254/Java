class IncrementOperators{
    public static void main(String a[]){
        //Increment operators

        //Ways to increment
        int number = number + 1;
        int number+=1;
        int number++; //Post-Increment
        int ++number; //Pre-Increment

        int marks = 90;
        int postIncrement = marks++;
        System.out.println(postIncrement);
        //Here, it will first fetch the value of marks i.e 90 and first save it into the var, postIncrement and then only it will increase the value by 1. Hence, the output is 90.

        int marks = 90;
        int preIncrement = ++marks;
        System.out.println(preIncrement);
        //Here, it will first increment the value of marks by 1 and then only it will fetch the value and store it into the var, preIncrement. Hence, the output is 91.
    }
}