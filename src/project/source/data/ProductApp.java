package project.source.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("imdomu", 5000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
