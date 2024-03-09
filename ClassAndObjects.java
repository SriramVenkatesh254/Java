class Calculator{
    public int add(int x, int y){
        int sum = x + y;
        return sum;
    }
}

class ClassAndObjects{
    public static void main(String a[]){
        int firstNumber = 5;
        int secondNumber = 6;
        Calculator obj = new Calculator(); //Creating an instance of the class Calculator.
        int finalResult = obj.add(firstNumber,secondNumber);
        System.out.println(finalResult);
    }

}