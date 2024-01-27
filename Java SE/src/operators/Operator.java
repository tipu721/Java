package operators;

public class Operator {

    public Operator(){
        System.out.println("Operator class constructor called");
    }


    public static void main(String[] args) {

        //increment & decrement operator
        System.out.println("Increment and decrement operator");
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21

        //inverting the value of a boolean
        System.out.println("inverting the value of boolean");
        boolean c=true;
        boolean d=false;
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true

        //shift operator
        System.out.println("shift operator");
        System.out.println(10<<3);//10*2^3=10*8=80 left shift
        System.out.println(72>>3);//10/2^3=9 right shift

        //logical vs bitwise operator
         a=10;
         b=5;
         int e =20;
        System.out.println("logical and vs bitwise and");
        System.out.println(a<b&&a++<e);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<e);//false && true = false
        System.out.println(a);//11 because second condition is checked

        System.out.println("logical or vs bitwise or");
        System.out.println(a>b||a++<e);//true || true = true
        System.out.println(a);//11 because second condition is not checked
        System.out.println(a>b|a++<e);//true | true = true
        System.out.println(a);//12 because second condition is checked


        System.out.println("Assignment Operator");
        short s1 = 25, s2 = 21;
        s1+=s2;
        //s1 = s1 + s2; compile time error because (s1+s2) return int
        System.out.println(s1);

    }
}
