 import java.util.Scanner;

public class  Experiment3B{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Both Roots are Equal");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Imaginary Roots");
        }

        sc.close();
    }
}