class ArithmeticOperators{
    public static void main(String a[]){
        //Addition
        byte num1 = 10;
        byte num2 = 10;
        int sum = num1 + num2;
        System.out.println(sum);

        //Subtraction
        byte num3 = 10;
        byte num4 = 10;
        int difference = num3 - num4;
        System.out.println(difference);

        //Multiplication
        byte num5 = 10;
        byte num6 = 10;
        int product = num5 * num6;
        System.out.println(product);

        //Division
        byte num7 = 10;
        byte num8 = 10;
        int quotient = num7 / num8;
        System.out.println(quotient);

        //Modulus
        byte num9 = 7;
        byte num10 = 5;
        int reminder = num9 % num10;
        System.out.println(reminder);

        //Increment operators

        //Ways to increment
        int number = number + 1;
        int number+=1;
        int number++; //Post-Increment
        int ++number; //Pre-Increment


        int num = 7;
        int result1 = ++num;
        // This will first increment the value and then it will fetch. Hence, it becomes 8.
        System.out.println(result1);
        
        int result2 = num++;
        // This will first fetch the value 7 and store it in the result and then increment the value by 1. Hence, it is still 7.
        System.out.println(result2);

    }
}