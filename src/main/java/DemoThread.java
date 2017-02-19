import bean.Resource;

public class DemoThread extends Thread{
    private final Resource resource1;
    private final Resource resource2;
    private String numberThread;

    public DemoThread(Resource res1, Resource res2, String number) {
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
