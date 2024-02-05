package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.SQLDataException;
import java.sql.SQLInput;

class TestException{

    int testUnCheckExption(int a, int b){

        int res = 0;

        if(b > a){
            throw new ArithmeticException("divisor is greater");  // user define exception
        }

        res = a/b;

        try{       //java it sefl thow exception from here;
            res = a/b;
            System.out.println("Code for not occouring exception"); // don't execute if exception occours.
        }
        catch (ArithmeticException e){
            System.out.println("Code during handle exception");
            System.out.println(e.getMessage());
        }
        finally{

            System.out.println("Must execute exception occour or not");
        }

        System.out.println("Rest of the code");

        return res;

    }


    void testCheckException() throws IOException, SQLDataException { //needs trows to propagate
        FileWriter fileWriter = new FileWriter("demo.txt");

        throw new SQLDataException("Sql Exception occours");
    }



    void UncheckExceptionCallingMethod() throws IOException {

            this.testUnCheckExption(10, 0);
            this.testCheckException();
    }

    void checkExceptionCallingMethod() throws IOException {

        this.testCheckException();
    }


}

public class ExceptionHanding {

    public static void main(String[] args) throws IOException {


        TestException te = new TestException();
        try{
            te.UncheckExceptionCallingMethod();
        }
        catch (ArithmeticException e ){
            System.out.println(e.getMessage());
            System.out.println("Checed Exception Propagate here Automaticly");
        }

       te.checkExceptionCallingMethod();




    }
}
