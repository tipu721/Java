package com.tipu.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

    @Autowired
    public Programmer(String name, String company, Laptop laptop) {
        this.name = name;
        this.company = company;
        this.laptop = laptop;
        System.out.println("Programmer class all arg called");
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
