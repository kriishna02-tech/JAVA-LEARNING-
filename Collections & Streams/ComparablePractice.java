import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return id + " | " + name + " | ₹" + price;
    }
}

public class ComparablePractice {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(105, "USB Cable", 400));
        products.add(new Product(101, "Laptop", 75000));
        products.add(new Product(104, "Monitor", 15000));
        products.add(new Product(102, "Mouse", 800));
        products.add(new Product(103, "Keyboard", 2500));

        System.out.println("----- Before Sorting -----");

        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products);

        System.out.println("\n----- After Sorting By Price -----");

        for (Product p : products) {
            System.out.println(p);
        }
    }
}