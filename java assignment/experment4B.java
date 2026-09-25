import java.util.Scanner;
public class experment4B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            do {
                if (num % i == 0 && i != num) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i < num);
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");

        sc.close();
    }
}