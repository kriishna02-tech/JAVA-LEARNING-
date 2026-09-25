public class Experiment1 {
    public static void main(String[] args) {

        // Student Details
        String name = "Krishna Kumar";
        int rollNo = 13;
        String className = "3A4";

        System.out.println("Name      : " + name);
        System.out.println("Roll No.  : " + rollNo);
        System.out.println("Class     : " + className);
        System.out.println();

        // Variables and Data Types
        int num = 100;
        float price = 99.99f;
        double percentage = 85.5;
        char grade = 'A';
        boolean result = true;

        // Display Hello World
        System.out.println("Hello World");

        // Display Variables
        System.out.println("Integer Value : " + num);
        System.out.println("Float Value   : " + price);
        System.out.println("Double Value  : " + percentage);
        System.out.println("Character Value : " + grade);
        System.out.println("Boolean Value : " + result);

        // Type Casting
        double d = num;            // Implicit Type Casting
        int i = (int) percentage;  // Explicit Type Casting

        System.out.println("Implicit Type Casting (int to double): " + d);
        System.out.println("Explicit Type Casting (double to int): " + i);
    }
}