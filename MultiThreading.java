class A extends Thread{
    private int threadNumber;
    public A(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i + " from thread number " + threadNumber);
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

// class B extends Thread{
//     @Override
//     public void run(){
//         for(int j = 0; j < 5; j++){
//             System.out.println(j);
//             // try {
//             //     Thread.sleep(1000);
//             // } catch (InterruptedException e) {
//             //     e.printStackTrace();
//             // }
//         }
//     }
// }

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            A thread = new A(i);
            thread.start();
        }
    }
}
