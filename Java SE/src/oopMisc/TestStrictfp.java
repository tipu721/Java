package oopMisc;

public class TestStrictfp {

    public static void main(String[] args) {

        Float f = 10000.55552555f;
        Float f1 = calculateFloat(f);
        System.out.println(f + " "+ f1);
    }

    strictfp static Float calculateFloat(Float f) {

        f += 565656959895.655f;
        return f;
    }
}
