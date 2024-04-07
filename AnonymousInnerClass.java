class Coffee{
    public void brewCoffee(){
        System.out.println("Brewing Instant coffee");
    }
    public void show(){
        System.out.println("Show");
    }
}

public class AnonymousInnerClass {
    public static void main(String args[]){
        Coffee obj = new Coffee() 
        //Anonymous Inner Class
        {
            public void brewCoffee(){
                //It executes the Anonymous inner class leaving the actual class behind.
                System.out.println("Brewing Filter Coffee");
            }
            public void show(){
                System.out.println("Show");
            }
        };

        obj.brewCoffee();
        obj.show();
    }

}
