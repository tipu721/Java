package com.tipu.model;

public class Laptop {

    String brand;

    public Laptop(){
        System.out.println("Laptop class no agr contructor called");
        System.out.println(this.brand);
    }


    public Laptop(String brand) {
        this.brand = brand;
        System.out.println("Laptop class all arg constructor called");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
