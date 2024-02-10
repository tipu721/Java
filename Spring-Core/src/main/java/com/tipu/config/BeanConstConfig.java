package com.tipu.config;

import com.tipu.model.Laptop;
import com.tipu.model.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tipu.model")
public class BeanConstConfig {


    @Bean
    Programmer programmer(Laptop laptop){
        Programmer programmer = new Programmer("Mehedi","DIT", laptop);

        return programmer;

    }

    @Bean
    Laptop laptop(){
        Laptop laptop= new Laptop("Lenevo");
        return  laptop;
    }

}
