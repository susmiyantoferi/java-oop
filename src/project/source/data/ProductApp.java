package project.source.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("imdomu", 5000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.toString());

        Product product1 = new Product("imdomu", 5000);
        System.out.println(product1.equals(product));
        System.out.println(product.hashCode() == product1.hashCode());
    }
}
