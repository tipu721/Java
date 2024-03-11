package multi_threading;

public class TestDaemonThread extends Thread{

    @Override
    public void run() {

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Running");
        }
        else {
            System.out.println("User Thread Running");
        }

    }

    public static void main(String[] args) {
        TestDaemonThread t1 = new TestDaemonThread();
        TestDaemonThread t2 = new TestDaemonThread();
//        TestDaemonThread t3 = new TestDaemonThread();

        t1.setDaemon(true);

        t1.start();
        System.out.println(t1.getState());
        System.out.println("Hello World");
        System.out.println(t1.getState());
//        t2.start();
//        t2.setDaemon(true); // not allowed after start
//        t3.start();
    }
}
