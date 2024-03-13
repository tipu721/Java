package lambda;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Comparator {


    public static void main(String[] args) {
        List<Product>productList = new ArrayList<>();
        productList.add(new Product("Laptop", 2500));
        productList.add(new Product("Bike", 15000));
        productList.add(new Product("AC", 75000));
        productList.add(new Product("Freez", 35000));


        //sort with lambda
        Collections.sort(productList,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });

        for(Product p : productList){
            System.out.println(p.name+" "+p.price);
        }


        //filter with lambda
        Stream<Product> filteredProductList = productList.stream().filter( p -> p.price > 20000);

        System.out.println("Print with lamba");
        filteredProductList.forEach(product -> System.out.println(product.name+" "+product.price));

    }
}
