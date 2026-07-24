import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Number : " + num);
        System.out.println("Float  : " + decimal);
        System.out.println("String : " + text);

        sc.close();
    }
}
