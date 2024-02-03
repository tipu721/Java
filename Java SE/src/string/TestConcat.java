package string;


public class TestConcat {

    public static void main(String[] args) {
        String s = "Tipu" + " Sultan";

        //internally works like bellow line
        String s1 = (new StringBuilder("Tipu").append("Sultan").toString());
        System.out.println(s);
        System.out.println(s1);

        System.out.println("concat primitive value");
        System.out.println("Tipu"+700+21); //after literal all the + will be string
        System.out.println(700+21+"Tipu"+23+27);

        System.out.println("Concat with string builder");
        StringBuilder stringBuilder = new StringBuilder("Tipu");
        StringBuilder stringBuilder1 = new StringBuilder("Sultan");
        stringBuilder.append(stringBuilder1);
        System.out.println(stringBuilder); //string builder mutable


        System.out.println("Concat with format");
        String s2 = new String("Hello");
        String s3 = new String(" World");
        String s4 = String.format("%s%s",s2,s3);
        System.out.println(s4);


        System.out.println("Concat with string join");

        String s5 = String.join(" ", s2, s3,s );
        System.out.println(s5);

    }
}
