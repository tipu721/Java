package com.tipu.config;

import com.tipu.model.Laptop;
import com.tipu.model.Programmer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class BeanSetterConfiguration {


    @Bean
    public Programmer programmer(@Qualifier("laptop1") Laptop laptop){
        Programmer p1 = new Programmer();
        p1.setName("Tipu");
        p1.setCompany("Divine IT Limited");
        p1.setLaptop(laptop);

        return  p1;
    }


    @Bean
    public Laptop laptop1(){
        Laptop l1 = new Laptop();
        l1.setBrand("HP");
        return l1;
    }

    @Bean
    public Laptop laptop2(){
        Laptop l1 = new Laptop();
        l1.setBrand("Samsung");
        return l1;
    }



}
