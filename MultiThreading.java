class A implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.println(i);
        }
    }
}

class B implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.println(i);
        }
        
    }
}



public class MultiThreading {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new A());
        thread1.start();

        Thread thread2 = new Thread((new B()));
        thread2.start();

        try {
            thread2.join(10000); // Wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
