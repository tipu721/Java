package garbage_collector;

public class TestGarbage {

    String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {

        TestGarbage obj1 = new TestGarbage();
        TestGarbage obj2 = new TestGarbage();
        obj2.name = "Tipu";
        System.out.println(obj2.name);
        System.gc();
    }
}
