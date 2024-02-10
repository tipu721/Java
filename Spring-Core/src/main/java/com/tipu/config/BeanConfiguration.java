package com.tipu.config;

import com.tipu.model.Laptop;
import com.tipu.model.Programmer;
import org.springframework.context.annotation.Bean;

public class BeanConfiguration {


    @Bean
    public Programmer programmer(Laptop laptop){
        Programmer p1 = new Programmer();
        p1.setName("Tipu");
        p1.setCompany("Divine IT Limited");
        p1.setLaptop(laptop);

        return  p1;
    }

    @Bean
    public Laptop laptop(){
        Laptop l1 = new Laptop();
        l1.setBrand("HP");
        return l1;
    }

}
