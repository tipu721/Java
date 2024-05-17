package multithreading;

public class TestRuntime {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        for(int i=0; i< 100000; i++){
            new TestRuntime();
        }
        System.out.println(Runtime.getRuntime().freeMemory());
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory());

    }


}
