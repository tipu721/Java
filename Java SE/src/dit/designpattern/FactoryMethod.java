package designpattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan{
    protected double rate;
    abstract void getRate();
}

class DomesticPlan extends Plan{

    @Override
    void getRate() {
        rate = 3.50;
    }
}
class CommercialPlan extends Plan{

    @Override
    void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan{

    @Override
    void getRate() {
        rate = 5.50;
    }
}


class GetPlanFactory{
        Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

public class FactoryMethod {

    public static void main(String args[])throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlan("COMMERCIALPLAN");
        plan.getRate();
        System.out.println(plan.rate);
    }

}
