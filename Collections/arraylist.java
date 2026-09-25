
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
    // public  static 
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
    }
}
