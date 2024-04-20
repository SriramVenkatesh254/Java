class Demo{
    public void show() throws ArithmeticException{
        int i = 2;
        int j = 0;
        j = 20 / i;
        System.out.println(j);
    }
}

class Demo2{
    public void show2() throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[5];
        System.out.println(arr[0]);
    }
}

class Demo3{
    @SuppressWarnings("null")
    public void show3() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }
}

public class DuckingException {
    public static void main(String args[]){
        Demo obj1 = new Demo();
        Demo2 obj2 = new Demo2();
        Demo3 obj3 = new Demo3();
        try{
            obj1.show();
            obj2.show2();
            obj3.show3();
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero. " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Limit of the Array is crossed my brother. " + e);
        }
        catch(NullPointerException e){
            System.out.println("You're printing the length of a null string my brother. " + e);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong. " + e);
        }
        System.out.println("Exceptions Handled");
    }
}
