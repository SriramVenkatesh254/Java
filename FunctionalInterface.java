// import java.lang.FunctionalInterface;
interface A
{
    void show();
}


//We can use this Class B to create an Object of Interface A or we can use Anonymous Inner Class
// @Overrride
// class B implements A{
//     public void show(){
//         System.out.println("In show");
//     }
// }

public class FunctionalInterface {
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("In Show (Anony inner class)");
            }
        };
        obj.show();
    }
}
