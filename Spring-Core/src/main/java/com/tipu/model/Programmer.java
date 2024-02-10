package com.tipu.model;

public class Programmer {
    String name;
    String company;
    Laptop laptop;

    public Programmer(){
        System.out.println("Programmer class no agr contructor called");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
