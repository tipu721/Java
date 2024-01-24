package control_statements;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Lebeled For Loop");
        aa:
        for(int i=1; i <=5; i++){
            bb:
            for(int j=6; j<=10; j++){
                if(j == 7){
                    //break  aa; // break outer loop
                    break bb; //break inner loop
                }
                System.out.println(i+" "+j);
            }

        }

        // while vs do while loop
        System.out.println("while loop");
        int n = 0;
        while (n < 0){
            System.out.println(n++);
        }
        System.out.println("do while loop");
        n = 0;
        do{
            System.out.println(n++);
        }while (n < 0);
    }
}
