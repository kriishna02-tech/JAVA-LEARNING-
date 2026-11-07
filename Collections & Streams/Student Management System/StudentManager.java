
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add(new Student(101, "krishna kumar", 99));
        students.add(new Student(102, "om jaiswal", 94));
        students.add(new Student(103, "mohit kumar", 59));
        students.add(new Student(104, "yes raj", 69));
        students.add(new Student(105, "sidd raj", 75));

        // Display all students
        for (Student s : students) {
            System.out.println(s);
        }

        // Search student by ID
        System.out.print("Enter student ID to search: ");
        int userId = sc.nextInt();

        boolean flag = false;

        for (Student st : students) {
            if (st.getId() == userId) {
                System.out.println(st);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Student not found.....");
        }

        int userResponse;

        do {
            System.out.println("\n1. Update marks");
            System.out.println("2. Add student");
            System.out.println("3. Delete student");
            System.out.println("4. print all students");
            System.out.println("5. Find highest-scoring student");
            System.out.println("6. Calculate average marks");
            System.out.println("0. EXIT");
            System.out.print("Enter choice: ");

            userResponse = sc.nextInt();

            switch (userResponse) {

                case 1: {
                    System.out.print("Enter student ID: ");
                    int stId = sc.nextInt();

                    boolean found = false;

                    for (Student st : students) {

                        if (st.getId() == stId) {
                            System.out.print("Enter new marks: ");
                            int upMarks = sc.nextInt();

                            st.setMarks(upMarks);
                            System.out.println("Marks updated!");
                            System.out.println(st);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter new student ID: ");
                    int newStudentId = sc.nextInt();

                    sc.nextLine(); // Consume leftover newline

                    System.out.print("Enter student name: ");
                    String newStudentName = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int newStudentMarks = sc.nextInt();

                    students.add(new Student(
                            newStudentId,
                            newStudentName,
                            newStudentMarks));

                    System.out.println("Student added successfully!");
                    break;
                }

                case 3: {
                    System.out.println("Enter id");
                    int stId = sc.nextInt();
                    boolean status = false;
                    // for (Student st : students) {
                    //     if (st.getId() == stId) {
                    //         students.remove(st);
                    //         status = true;
                    //         System.out.println("Student deleted successfull");
                    //         break;
                    //     }
                    // }
                    for (int i = 0 ; i< students.size() ; i++) {
                        Student st  = students.get(i);
                        if (st.getId() == stId) {
                            students.remove(i);
                            status = true;
                            System.out.println("Student deleted successfull");
                            break;
                        }
                    }

                    if (!status) {
                        System.out.println("Student not found");
                    }
                    for (Student st : students) {
                        System.out.println(st);
                    }

                    break;
                }

                case 4: {
                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;
                }

                case 5 : {
                    Student topper  = null;
                    if(students.size() == 0 ){
                        System.out.println("No student in class");
                    } else{
                        topper = students.get(0);
                    }
                    int max_marks = 0;
                    for(Student st : students){
                        if(st.getMarks() > max_marks){
                            max_marks = st.getMarks();
                            topper = st;
                        }
                    }
                    System.out.println("topper :" + topper );
                    break;
                }

                case 6:{
                    int noStudent = students.size();
                    if(noStudent == 0){
                        System.out.println("No students available to calculate average.");
                        break;
                    }
                    else{
                        double avgMarks = 0;
                        for(Student st : students){
                            avgMarks+=st.getMarks();
                        }
                        System.out.println("Average marks : " + avgMarks/noStudent);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Exiting program...");
                    break;
                }

                default: {
                    System.out.println("Invalid choice!");
                }
            }

        } while (userResponse != 0);

        sc.close();
    }
}
