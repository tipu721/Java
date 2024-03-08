package multi_threading;

class AA implements Runnable{


    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Hi Thead class method");
        }

    }
}

class BB implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Hello Thread class method");
        }

    }
}

public class ThreadTest2 {

    public static void main(String[] args) {

        AA obj1 = new AA();
        BB obj2 = new BB();

//        obj1.run();
//        obj2.run();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
//        t1.run(); //could not start multithread with without start
//        t2.run();


        t1.start();
        t2.start();




    }
}
