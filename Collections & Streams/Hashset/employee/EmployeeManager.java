
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        employees.add(new Employee(101, "krishna kumar", "CSE"));
        employees.add(new Employee(102, "Mohit singh", "EEE"));
        employees.add(new Employee(103, "Rohit sharma", "CSE"));
        employees.add(new Employee(104, "Purohit thakur", "ME"));
        employees.add(new Employee(105, "Mohit singh", "CSE"));
        employees.add(new Employee(106, "Sukh raj", "ME"));

        System.out.println(employees.add(
                new Employee(101, "Krishna", "CSE")));

        System.out.println(employees.add(
                new Employee(101, "Mohit", "EEE")));

        System.out.println(employees.size());

        
        // 1. Register employee
        System.out.print("Enter new employee ID: ");
        int userId = sc.nextInt();

        boolean exists = false;

        for (Employee e : employees) {
            if (e.getId() == userId) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Employee already exists");
        } else {
            sc.nextLine(); // i must ask teacher to learn this otherwise i will forgot about thiss... Q1->
                           // when and how to know when i should use and why it throw empty String

            System.out.print("Enter employee name: ");
            String userName = sc.nextLine();

            System.out.print("Enter department: ");
            String userDepart = sc.nextLine();

            employees.add(new Employee(userId, userName, userDepart));

            System.out.println("Employee registered successfully");
        }

        // 2. Search employee
        System.out.print("Enter ID to search employee: ");
        int empId = sc.nextInt();

        boolean searchFound = false;

        for (Employee e : employees) {
            if (e.getId() == empId) {
                System.out.println("Employee found:");
                System.out.println(e);
                searchFound = true;
                break;
            }
        }

        if (!searchFound) {
            System.out.println("Employee doesn't exist");
        }

        // 3. Remove employee
        System.out.print("Enter ID to remove employee: ");
        int empIdRmv = sc.nextInt();

        boolean removeFound = false;

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee e = it.next();

            if (e.getId() == empIdRmv) {
                it.remove();
                removeFound = true;
                System.out.println("Employee removed successfully");
                break;
            }
        }

        if (!removeFound) {
            System.out.println("Employee doesn't exist");
        }

        // 4. Display employees
        System.out.println("\nAll remaining employees:");

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Total employees: " + employees.size());

        sc.close();
    }
}
