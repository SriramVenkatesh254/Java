interface Desktop{
    void imMobile();
}

public class LambdaExpressions {
    public static void main(String args[]){
        Desktop obj = () -> System.out.println("Desktops are Immobile");
        obj.imMobile();
    }
}
