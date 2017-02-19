import bean.Resource;

public class DeadLockRunner {

    public static void main(String args[]) {

        Resource resource1 = new Resource("Car 1: green");
        Resource resource2 = new Resource("Car 2: red");

        //task 1
        DemoThread demoThread1 = new DemoThread(resource1, resource2, "1");
        DemoThread demoThread2 = new DemoThread(resource2, resource1, "2");
        demoThread1.start();
        demoThread2.start();

        //task 3
//        Resource resource3 = new Resource("Car 3: black");
//        Resource resource4 = new Resource("Car 4: white");

//        DemoThread demoThread1 = new DemoThread(resource1, resource2, "1");
//        DemoThread demoThread2 = new DemoThread(resource2, resource3, "2");
//        DemoThread demoThread3 = new DemoThread(resource3, resource4, "3");
//        DemoThread demoThread4 = new DemoThread(resource4, resource1, "4");

//        demoThread1.start();
//        demoThread2.start();
//        demoThread3.start();
//        demoThread4.start();


    }
}
