
import java.util.*;

public class ProductStockManager {
    public static void main(String[] args) {

        HashMap<String, Integer> stocks = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        stocks.put("laptop", 5);
        stocks.put("Mouse", 20);
        stocks.put("Keyboard", 10);
        stocks.put("Monitor", 3);
        stocks.put("USB cable", 30);

        // Display initial inventory
        for (Map.Entry<String, Integer> entry : stocks.entrySet()) {
            System.out.println("Product : " + entry.getKey());
            System.out.println("Stock : " + entry.getValue());
        }

        System.out.println("---------------------------------------------");

        System.out.print("Enter Product name : ");
        String pName = sc.nextLine();

        // Check product existence first
        if (stocks.containsKey(pName)) {

            int availableStock = stocks.get(pName);

            System.out.println("Available quantity : " + availableStock);

            System.out.print("Enter purchase quantity : ");
            int pQuantity = sc.nextInt();

            if (pQuantity <= 0) {
                System.out.println("Invalid quantity. Enter a positive number.");

            } else if (pQuantity > availableStock) {
                System.out.println("Insufficient stock.");

            } else {
                int remainingStock = availableStock - pQuantity;

                stocks.put(pName, remainingStock);

                System.out.println("Purchase completed successfully!");
                System.out.println("Remaining stock : " + remainingStock);
            }

        } else {
            System.out.println("Product not found.");
        }

        System.out.println("---------------------------------------------");

        // Display final inventory
        System.out.println("Final Inventory:");

        for (Map.Entry<String, Integer> entry : stocks.entrySet()) {
            System.out.println("Product : " + entry.getKey());
            System.out.println("Stock : " + entry.getValue());
        }

        sc.close();
    }
}
