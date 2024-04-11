interface A{
    void show();
}

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
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
