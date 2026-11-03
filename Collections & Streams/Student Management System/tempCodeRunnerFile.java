
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new  Scanner(System.in);
        students.add(new Student(101, "krishna kumar ", 99));
        students.add(new Student(102, "om jaiswal    ", 94));
        students.add(new Student(103, "mohit kumar   ", 59));
        students.add(new Student(104, "yes raj       ", 69));
        students.add(new Student(105, "sidd raj      ", 75));

        for(Student s : students){
            System.out.println(s);
        }

        //Ask the user to enter a student ID using Scanner.
        System.out.print("Enter student ID: ");
        int userId = sc.nextInt();
        boolean flag = false;
        for(int i = 0 ; i< students.size() ; i++){
            Student st =  students.get(i);

            if(st.getId() == userId){
                // System.out.println(st.toString());
                System.out.println(st);
                flag = true;
                break;
            }
        }
        if(!flag){
                System.out.println("Student not found.....");
        }

        int userResponse = -1;

        do{
            System.out.println("1. update marks..");
            System.out.println("2. Add student..");
            System.out.println("0. ----EXIT----");
            switch (userResponse) {
                case 1:{
                    System.out.print("Enter student ID: ");
                    int stId = sc.nextInt();
                    int upMarks;
                    for(int i = 0 ; i< students.size() ; i++){
                        Student st =  students.get(i);

                        if(st.getId() == userId){
                        st.setMarks(upMarks);
                        break;
                        }
                    }
                    break;
                }
                case 2 : {
                    int newStudentId = sc.nextInt();
                    String newStudentName = sc.next();
                    int newStudentMarks = sc.nextInt();
                    students.add(new Student(newStudentId , newStudentName , newStudentMarks));
                    break;
                }
                    
                default:
                    throw new AssertionError();
            }
        }
        while(userResponse == 0);
        sc.close();
    }
}
