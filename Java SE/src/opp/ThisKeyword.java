package opp;

class A{
    int a = 10;
    void n(){
        System.out.println("n called");
    }
    void m(A a){
        System.out.println("m called");
        a.n();
        this.n();
    }
    A(){
        System.out.println(this);
    }
}
public class ThisKeyword {


    public static void main(String[] args) {

        A a = new A();
        a.n();

    }
}
