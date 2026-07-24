import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter operator:");
        String op = sc.next();
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Print the result evaluated by the switch expression
        System.out.println(switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> (b != 0) ? (a / b) : "Cannot divide by zero";
            case "%" -> (b != 0) ? (a % b) : "Cannot perform modulo by zero";
            default  -> "Invalid operator";
        });

        sc.close();
    }
}