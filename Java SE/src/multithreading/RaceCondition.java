package multithreading;

class Counter{
    Integer count = 0;
    synchronized void  increment(){
        count++;
    }
}

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable r1 =  ()->{
            for(int i=1; i<=1000; i++){
                counter.increment();
            }
        };

        Runnable r2 =  ()->{
            for(int i=1; i<=1000; i++){
                counter.increment();
            }
        };


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
