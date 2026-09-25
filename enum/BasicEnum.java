import java.util.Scanner;

enum Day {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class BasicEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day d = Day.valueOf(sc.nextLine());

        switch (d) {
            case Sunday:
                System.out.println("Off day");
                break;
            case Saturday:
                System.out.println("Half day");
                break;
            default:
                System.out.println("WORKING DAY");
        }
    }
}