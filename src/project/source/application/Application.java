package project.source.application;

import project.source.data.Product;

//import all
import project.source.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Indomilk", 20000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
