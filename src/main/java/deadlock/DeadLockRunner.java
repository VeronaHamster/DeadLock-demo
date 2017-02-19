package deadlock;
import deadlock.bean.ThreadResource;

public class DeadLockRunner {

    public static void main(String args[]) {

        ThreadResource resource1 = new ThreadResource("Car 1: green");
        ThreadResource resource2 = new ThreadResource("Car 2: red");
        ThreadResource resource3 = new ThreadResource("Car 3: black");
        ThreadResource resource4 = new ThreadResource("Car 4: white");

        DemoThread demoThread1 = new DemoThread(resource1, resource2, "1");
        DemoThread demoThread2 = new DemoThread(resource2, resource3, "2");
        DemoThread demoThread3 = new DemoThread(resource3, resource4, "3");
        DemoThread demoThread4 = new DemoThread(resource4, resource1, "4");

        demoThread1.start();
        demoThread2.start();
        demoThread3.start();
        demoThread4.start();
    }
}
