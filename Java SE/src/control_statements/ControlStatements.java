package control_statements;

public class ControlStatements {

    public static void main(String[] args) {


        System.out.println("Swith Case Statement");
        int number = 10;
        switch (number){
            case 10 :
                System.out.println(10);
//                number = 20;
//                break; // if not give break case 20 will execute
            case 20:
                System.out.println(20);
                System.out.println("Extra line");
                break;
            default:
                System.out.println("output for default case");

        }
        System.out.println("rest of the code");
    }

}
