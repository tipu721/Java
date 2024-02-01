package oopMisc;

class CustomWrapper{
    private int i;
    CustomWrapper(int i) {
        this.i = i;
    }

    int getValue() {
        return this.i;
    }
    void setValue(int i){
        this.i = i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class TestWrapperClass {

    public static void main(String[] args) {
        int a = 20;

        System.out.println("Auto Boxing");
        Integer b = a; // no need Intiger.valueOf(a)
        System.out.println( a + " " + b);

        System.out.println("Unboxing");
        b = 132;
        int c = b; //no need b.intValue
        System.out.println(b+ " "+ c);


        System.out.println("Create Custom Wrapper class");
        int var = 90;
        CustomWrapper customWrapper = new CustomWrapper(90);
        customWrapper.setValue(36);
        System.out.println(customWrapper);

    }
}
