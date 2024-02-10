package com.tipu.model;

public class Laptop {

    String brand;

    public Laptop(){
        System.out.println("Laptop class no agr contructor called");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
