package multithreading;


class A extends Thread{
    void show(){
        for(int i=0; i<5; i++){
            System.out.println("Hi Simple Class Method");
        }

    }

    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Hi Thread Class Method");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

class B extends Thread{
    void show(){
        for(int i=0; i<5; i++){
            System.out.println("Hello Simple Class Method");
        }

    }

    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Heloo Thread class Method");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}

public class ThreadTest {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();



        System.out.println("Nomal Output");
        obj1.show();
        obj2.show();


        System.out.println("Thread Output");
        System.out.println("Priority :"+obj1.getPriority());
        obj1.setPriority(10);
        obj1.start();
        obj2.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Output for main thread");
    }

}
