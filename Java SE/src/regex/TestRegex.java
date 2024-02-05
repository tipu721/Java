package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {
        // 3ways to write regex

        //1st way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("bs");
        boolean b = m.matches();
        System.out.println(b);

        //2nd way
        boolean b1 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b1);

        //3rd way
        boolean b2 = Pattern.matches(".s", "as");
        System.out.println(b2);


        //3rd way

    }
}
