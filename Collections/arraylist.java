import java.util.ArrayList;
class Product{
    private int id;
    private String name;
    private  double price;
    private int stock;


    Product(int id , String name , double  price , int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public double  getPrice(){
        return price;
    }
    
    public int getStock(){
        return  stock;
    }
    
    @Override 
    public String toString(){
        return name + " - ₹" + price + " - Stock: " + stock;
    }
}
public class arraylist {
    public static void findMostExpensive(ArrayList<Product> products){
        // syntax
        // class object(refrence variable)  =  first object assigned
        Product mostExpensive = products.get(0);   //this is object that we assume , it is most expensive
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products.get(i);
            }
        }
        System.out.println("Most Expensive :: " + mostExpensive);
    }

    public static void printLowStock(ArrayList<Product> products){
        for (Product p : products) {
            if (p.getStock() < 10) {
                System.out.println(p.getName());
            }
        }
    }

    public static void calculateInventoryValue(ArrayList<Product> products){
        double value= 0;
        for(Product p : products){
            value = value + (p.getStock()*p.getPrice());
        }
        System.out.println("Inventery value :: " + value);
    }

    public static void findProductByName(ArrayList<Product> products , String keyword){
        for(Product p : products){
            if(p.getName().equals(keyword)){
                System.out.println("Found :: " + p.getName());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 75000, 5));
        products.add(new Product(2, "Mouse", 800, 20));
        products.add(new Product(3, "Keyboard", 2500, 8));
        products.add(new Product(4, "Monitor", 15000, 3));
        products.add(new Product(5, "USB Cable", 400, 30));


        for(int i = 0 ; i< 5 ; i++){
            System.out.println(products.get(i));
        }

                // 1. Print all products
        System.out.println("----- All Products -----");

        for (Product p : products) {
            System.out.println(p);
        }


        // 2. Find most expensive product
        System.out.println("\n----- Most Expensive -----");

        findMostExpensive(products);


        // 3. Print low stock products
        System.out.println("\n----- Low Stock -----");

        printLowStock(products);


        // 4. Calculate total inventory value
        System.out.println("\n----- Inventory Value -----");

        calculateInventoryValue(products);


        // 5. Find product by name
        System.out.println("\n----- Search Product -----");

        findProductByName(products, "Keyboard");
    }
}
