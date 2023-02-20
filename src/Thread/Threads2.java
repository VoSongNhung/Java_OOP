package Thread;

public class Threads2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread two is: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
