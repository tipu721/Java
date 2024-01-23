package varialbe;

public class VariableCasting {
    int a = 10;

    //widening
    float f = a;


    //narrowing
    //int b = f;  compilation error
    int b = (int)f;

    //overflow
    byte by = (byte) b; //ok
    int c = 135;
    byte cy = (byte) c; // but error result for overflow
    public static void main(String[] args) {
        VariableCasting variableCasting = new VariableCasting();
        System.out.println(variableCasting.a);
        System.out.println(variableCasting.f);
        System.out.println(variableCasting.b);
        System.out.println(variableCasting.by);
        System.out.println(variableCasting.cy);

        //adding variable with lower memory
        byte a = 5, b = 4;
        //byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c = (byte)(a + b);
        System.out.println(c);

    }
}
