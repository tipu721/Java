package multi_threading;

public class TestThreadGroup implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {


        TestThreadGroup runnable = new TestThreadGroup();


        ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");

        Thread t1 = new Thread(tg1, runnable, "one" );
        Thread t2 = new Thread(tg1, runnable, "two" );
        Thread t3 = new Thread(tg1, runnable, "three");

        t1.start();
        t2.start();
        t3.start();

       tg1.list();



    }
}
