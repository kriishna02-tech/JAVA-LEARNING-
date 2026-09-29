
import java.util.ArrayList;
import java.util.Comparator;

class Product {

    private final int id;
    private final String name;
    private final double price;
    private final int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return name + " | ₹" + price + " | stock=" + stock;
    }
}

public class ComparatorPractice {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 75000, 5));
        products.add(new Product(102, "Mouse", 800, 20));
        products.add(new Product(103, "Keyboard", 2500, 8));
        products.add(new Product(104, "Monitor", 15000, 3));
        products.add(new Product(105, "USB Cable", 400, 30));

        System.out.println("----- Original List -----");
        // products.forEach(System.out::println);
        for (Product p : products) {
            System.out.println(p);
        }

        // 1. Sort by price: low to high
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("\n----- Price: Low to High -----");
        for (Product p : products) {
            System.out.println(p);
        }

        // 2. Sort by name: A to Z
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\n----- Name: A to Z -----");
        for (Product p : products) {
            System.out.println(p);
        }

        // 3. Sort by stock: high to low
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare(p2.getStock(), p1.getStock());
            }
        });

        System.out.println("\n----- Stock: High to Low -----");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
