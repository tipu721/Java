package oop.inheritance;

class Address{
    String ps;
    String district;
    Address(String ps, String district){
        this.ps = ps;
        this.district = district;
    }


    @Override
    public String toString() {
        return "Address{" +
                "ps='" + ps + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}

class Employee{
    Integer rool;
    String name;
    Address address;
    Employee(Integer rool, String name, Address address){
        this.rool = rool;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rool=" + rool +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


public class Aggregation {

    public static void main(String[] args) {
        Employee em1 = new Employee(01, "Tipu", new Address("Kalukhali", "Rajbari"));
        System.out.println(em1);
    }
}
