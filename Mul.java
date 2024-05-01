public class Mul {
    public static void main(String[] args) {

        Runnable obj1 = () -> 
            {
                for(int i = 0; i < 10; i++){
                    System.out.println("Hello");
                    try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
                }
            };
        Runnable obj2 = () -> 
        {
                for(int i = 0; i < 10; i++){
                    System.out.println("Heyy");
                    try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
                }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2); 

        thread1.start();
        thread2.start();
    }
}
