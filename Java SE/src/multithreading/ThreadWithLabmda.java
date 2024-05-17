package multithreading;

public class ThreadWithLabmda {

    public static void main(String[] args) {
        Runnable r1 = ()-> {
            for(int i=0; i<5; i++){
                System.out.println("Thread Running with Lambda");
            }
        };

       Thread t1 = new Thread(r1);
       t1.start();

    }


}
