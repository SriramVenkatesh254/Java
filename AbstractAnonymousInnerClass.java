abstract class Computer{
    public abstract void mobility();
    public abstract void upgradeLimitation();
}

public class AbstractAnonymousInnerClass {
    public static void main(String args[]){
        Computer obj = new Computer(){
            public void mobility(){
                System.out.println("Inside the new Mobility method");
            };
            public void upgradeLimitation(){
                System.out.println("I have upgrade limitation");
            }
        };
        obj.mobility();
        obj.upgradeLimitation();
    }
}
