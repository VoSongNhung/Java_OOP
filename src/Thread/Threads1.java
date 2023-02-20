package Thread;

public class Threads1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread one is: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Threads1 threads = new Threads1();
        Threads2 threads2 = new Threads2();
        Thread thread =  new Thread(threads);
        Thread thread2 =  new Thread(threads2);
        thread.start();
        thread2.start();
    }
}
