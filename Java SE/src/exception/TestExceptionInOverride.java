package exception;

import java.sql.SQLException;

class Parent{

    void msg() throws Exception{
        System.out.println("Parent class mehtod");
        throw new Exception("Exception occoured");


    }

}

class Child extends Parent{

    @Override
    void msg()  {
        System.out.println("child class method"); //can have no exception here
        //throw new SQLException("SQL Exception occoured"); //must have in parent class
    }
}

public class TestExceptionInOverride {
}
