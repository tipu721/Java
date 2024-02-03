package string;

public class TestString {
    public static void main(String[] args) {
        char[] ch = {'j','a','v','a','t','p','o','i','n','t'};
        String s = new String("Javatpoint");
        String s1 = "Javatpoint";
        String s2 = "Javatpoint";
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println(s+" "+s1);
        System.out.println(s1.equals(s));
        System.out.println(s2 == s);
        System.out.println(s1 == s2);

        // string methods
        System.out.println(s.toUpperCase());


        System.out.println("String immuteable");

        String s3 = "Tipu";
        String s4 = s3.concat("Sultan");
        System.out.println(s3);

        System.out.println("String compare to");
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));
        System.out.println(s1.compareTo(s));


    }
}
