package oopMisc;

final class  Employee{
    final Integer id;
    Employee(Integer id){
        this.id = id;
    }
    Integer getEmployeeId(){
        return id;
    }

}

public class TestImmutableClass {
    public static void main(String[] args) {
        Employee em1 = new Employee(10001);
        System.out.println(em1.getEmployeeId());
    }



}

