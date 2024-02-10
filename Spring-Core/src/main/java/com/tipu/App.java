package com.tipu;

import com.tipu.config.BeanConstConfig;
import com.tipu.config.BeanSetterConfiguration;
import com.tipu.model.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Spring Boot");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanSetterConfiguration.class);
        Programmer programmer = (Programmer) context.getBean("programmer");


        System.out.println("Output for setter injection");
        System.out.println(programmer.getName());
        System.out.println(programmer.getLaptop().getBrand());


        System.out.println("Output for constructor injection");
        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConstConfig.class);
        Programmer programmer1 = (Programmer) context.getBean("programmer");
        System.out.println(programmer1.getName());
        System.out.println(programmer1.getLaptop().getBrand());



    }
}
