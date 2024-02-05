package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;
import java.io.*;

class Laptop{
        String name;
        Integer price;
        Laptop(String name, Integer price){
        this.name = name;
        this.price = price;
        }
}
// The main method must be in a class named "MainThread".

public class StreamMain {
    public static void main(String[] args) {
//        List<String> nameList = new ArrayList<>();
//        nameList.add("Abdul Bari");
//        nameList.add("Abdul Kadir");
//        nameList.add("Zaminur Reza");
//        nameList.add("Aaaaa");
//        nameList.add("Saidur Rahman");
//
//        long c = nameList.stream()
//                .filter(s -> s.startsWith("A"))
//                .map(s -> s.toUpperCase())
//                .sorted()
//                .count();
//        System.out.println(c);


        List<Laptop>laptopList = new ArrayList<>();
        Laptop l1 = new Laptop("Hp", 25000);
        Laptop l2 = new Laptop("Asus", 45000);
        laptopList.add(l1);
        laptopList.add(l2);
        System.out.println(laptopList);

    }
}
