package deadlock;
import deadlock.bean.ThreadResource;

public class DemoThread extends Thread{
    private final ThreadResource resource1;
    private final ThreadResource resource2;
    private String numberThread;

    public DemoThread(ThreadResource res1, ThreadResource res2, String number) {
        this.resource1 = res1;
        this.resource2 = res2;
        this.numberThread = number;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println("Thread " + numberThread + " holding " + resource1.toString());
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread " + numberThread);
            }
            System.out.println("Thread " + numberThread + " waiting for " + resource1.toString());

            synchronized (resource2) {
                System.out.println("Thread " + numberThread + " waiting for " + resource1.toString() + " and " + resource2.toString());
            }
        }
    }
}
