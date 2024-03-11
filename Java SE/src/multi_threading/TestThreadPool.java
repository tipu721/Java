package multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class WorkerThread implements Runnable{

    private String message;
    public WorkerThread(String s){
        this.message = s;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"(Start)"+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");

    }

    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Runnable worker = null;
        for(int i=0; i<10; i++){
           worker = new WorkerThread(" "+ i);
           executor.execute(worker);//calling execute method of ExecutorService
        }


        executor.shutdown();
        System.out.println("Finished all threads");
    }


}

