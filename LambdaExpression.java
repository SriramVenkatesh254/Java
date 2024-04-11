interface A{
    void show(int i, int j);
}

public class LambdaExpression {
    public static void main(String args[]){
        A obj = (i,j) -> System.out.println("In show " + i + " " + j);
        obj.show(5,8);
    }
}
