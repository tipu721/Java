package multi_threading;

public class ThreadTest3 {

    public static void main(String[] args) {
        Thread t1 = new Thread("thread1");

        t1.start();
        System.out.println(t1.getState());
    }

}
