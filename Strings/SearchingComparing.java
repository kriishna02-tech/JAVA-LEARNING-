import java.util.Scanner;
public class SearchingComparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter str2 : ");
        String str2 = sc.nextLine();


        System.out.println("is both str1 and str2 equal : " + str1.equals(str2));
        System.out.println("is both str1 and str2 equal : " + str1.equalsIgnoreCase(str2));
    }
}
