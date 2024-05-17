package multithreading;


class Multi extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " is running");
    }
}

class Multi2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is running");
    }
}

public class CreateThread{

    public static void main(String[] args) {

        //1 extending Thread class
        Multi t1 = new Multi();
        t1.start();

        //2 implementing runnable interface by new Thread(Runnable r) constructor
        Runnable r = new Multi2();
        Thread t2 = new Thread(r);
        t2.start();

        // creating an object of the Thread class using the constructor Thread(String name)
        Thread t3 = new Thread("My Thread");
        t3.start();
        System.out.println(t3.getName()+" "+t3.getState());

        //Using the Thread Class: Thread(Runnable r, String name)
        Thread t4 = new Thread(r, "My Thread-2");
        t4.start();




    }
}
