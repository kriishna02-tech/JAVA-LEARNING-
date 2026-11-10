import java.util.*;

public class StudentDirectory {
    public static void main(String[] args){
        HashMap<Integer , String>  students = new  HashMap<>();
        Scanner sc = new Scanner(System.in);

        students.put(101, "krishna");
        students.put(102, "Mohit");
        students.put(103, "OM");
        students.put(104, "Rishi");
        students.put(105, "Ishant");

        System.out.println("Students : " + students);

        //take students id
        System.out.println("Enter Studnet Id : ");
        int studnetsId = sc.nextInt();

        if(students.containsKey(studnetsId)){
            System.out.println(students.get(studnetsId));
        }else{
            System.out.println("Student not found");
        }

        students.put(103, "Rahul");
        students.remove(105);
        System.out.println("Size : "+ students.size());
        // System.out.println("Students : " + students);
        for (Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println("ID: " + entry.getKey());
            System.out.println("Name: " + entry.getValue());
        }
        sc.close();
    }
}
