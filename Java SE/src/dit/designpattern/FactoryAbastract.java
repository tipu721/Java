package designpattern;

interface Bank{
    String getBankName();
}

class HDFC implements Bank{

    private final String BNAME;
    public HDFC(){
        BNAME = "HDFC BANK";
    }
    @Override
    public String getBankName() {
       return BNAME;
    }
}

class ICICI implements Bank{
    private final String BNAME;
    ICICI(){
       BNAME = "ICICI BANK";
    }
    @Override
    public String getBankName() {
        return BNAME;
    }
}


class SBI implements Bank{
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}


abstract class Loan{

    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculatorLoanPayment(double loanamount, int years){
        double EMI;
        int n;

        n = years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
    }

}

class HomeLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}
class BussinessLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }

}

class EducationLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}//End of the EducationLoan class.
public class FactoryAbastract {
}
