package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Tipu Sultan");
        sbd.append("Java Lover");
        System.out.println(sbd);
        System.out.println(sbd.capacity());
    }
}
