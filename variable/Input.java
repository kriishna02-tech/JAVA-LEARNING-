import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt();
        float fl = sc.nextFloat();
    
        System.out.println("Number: " + num);
        System.out.println("Float: " + fl);
    }
}
