package exception;

public class TestFInalizeMetho {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize mehtod called");
    }

    public static void main(String[] args) {
        TestFInalizeMetho tf = new TestFInalizeMetho();
        tf = null;
        System.gc();
        System.out.println("Garbaje callector finishied");
    }
}
