class MyOwnException extends Exception{
    public MyOwnException(String exceptionMessage){
        super(exceptionMessage);
    }
}

public class CustomException {
    public static void main(String args[]){
        int i = 20;
        int j = 0;
        try{
            j = 18 / i;
            if(j == 0)
                throw new MyOwnException("Output -> 0");
        }
        catch(MyOwnException e){
            j = 18 / 1;
            System.out.println("Thats the default output. " + e);
        }
        System.out.println(j);
    }
}
