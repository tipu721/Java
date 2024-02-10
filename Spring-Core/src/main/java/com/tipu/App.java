package com.tipu;

import com.tipu.config.BeanConfiguration;
import com.tipu.model.Laptop;
import com.tipu.model.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Spring Boot");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Programmer programmer = context.getBean(Programmer.class);
        System.out.println(programmer.getName());
        System.out.println(programmer.getLaptop().getBrand());
    }
}
