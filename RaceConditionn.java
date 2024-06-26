class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class RaceConditionn {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter(); 

        Runnable obj1 = () -> 
            {
                for(int i = 0; i < 1000; i++){
                    counter.increment();
                }
            };
        Runnable obj2 = () -> 
        {
                for(int j = 0; j < 1000; j++){
                    counter.increment();
                }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2); 

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);
    }
}
