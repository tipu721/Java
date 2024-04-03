package optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        String[] s = new String[10];
       s[2] = "love";
       s[1] = "is";
       s[0] = "power";
       s[4] = "none";

        Optional<String>stringOptional = Optional.of(s[3]);
        System.out.println();
    }
}
