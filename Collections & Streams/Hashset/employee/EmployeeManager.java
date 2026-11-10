import java.util.HashSet;
import java.util.Scanner;
public class EmployeeManager {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        employees.add(new Employee(101, "krishna kumar" ,  "CSE"));
        employees.add(new Employee(102, "Mohit singh" ,  "EEE"));
        employees.add(new Employee(103, "Rohit sharma" ,  "CSE"));
        employees.add(new Employee(104, "Purohit takur" ,  "ME"));
        employees.add(new Employee(105, "Mohit singh" ,  "CSE"));
        employees.add(new Employee(105, "Mohit singh" ,  "ME"));
        employees.add(new Employee(106, "Sukh raj" ,  "ME"));
        
        System.out.println("Enter user Id : ");
        int userId = sc.nextInt();
        if(employees.contains(userId)){
            System.out.println("Employee already exits");
        }else{
            sc.nextLine();
            System.out.println("Enter user Name : ");
            String userName = sc.nextLine();
            System.out.println("Enter user Deparment : ");
            String userDepart = sc.nextLine();

            employees.add(new Employee(userId, userName, userDepart));
        }

        System.out.println("enter id to search Employee : ");
        int empId = sc.nextInt();
        for(Employee e : employees){
            Employee emp = e;
            if(emp.getId() == empId){
                System.out.println("Employee  exits");
            }
            else{
                System.out.println("Employee doesnt exits");
            }
        }

        System.out.println("enter id to search Employee : ");
        int empIdRemove = sc.nextInt();
        for(Employee e : employees){
            Employee emp = e;
            if(emp.getId() == empIdRemove){
                employees.remove(e);
                System.out.println("Employee  removed");
            }
            else{
                System.out.println("Employee doesnt exits");
            }
        }


        
    }
}
