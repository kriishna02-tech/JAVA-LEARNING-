import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Text input (Multiple words)
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        // 2. Integer input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // 3. Decimal input
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        // 4. Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // 5. Character input (Scanner has no nextChar(), so we grab index 0)
        System.out.print("Enter gender initial (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.println("\n--- Summary ---");
        System.out.println(name + " | Age: " + age + " | GPA: " + gpa + " | Student: " + isStudent + " | Gender: " + gender);
        
        scanner.close();
    }
}
