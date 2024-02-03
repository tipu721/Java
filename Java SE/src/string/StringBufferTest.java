package string;

public class StringBufferTest {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Hello "); // immutable and thead safe
        sbf.append("Java");
        sbf.append(" Tipu Sultan's Favourites");

        System.out.println(sbf.length());
        System.out.println(sbf.capacity());

    }

}
