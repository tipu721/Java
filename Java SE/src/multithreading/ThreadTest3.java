package multithreading;


public class ThreadTest3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {

        // creating an object of the Thread class using the constructor Thread(String name)
        Thread t1 = new Thread("thread1");

        //creating an object of the class Thread using Thread(Runnable r, String name)
        Runnable r1 = new ThreadTest3();
        Thread t2 = new Thread(r1, "My new thread");
        t1.start();
        t2.start();
        //t1.start(); // can not start() thread multiple time
        System.out.println(t2.getName());


        Runnable r2 = ()-> {
                for(int i=0; i<5; i++){
                    System.out.println("Runnable Thead running");
                }
            };

        Thread t3 = new Thread(r2);
        t3.start();
    }


}
