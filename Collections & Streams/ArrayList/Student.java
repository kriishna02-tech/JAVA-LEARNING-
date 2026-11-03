import java.util.ArrayList;

public class Student{
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("krishna kumar");
        students.add("Mohit kumar");
        students.add("om jaiswal");
        students.add("manish kumar");
        students.add("paras chavan");

        for(String s : students){
            System.out.println("Name : " + s);
        }

        students.remove(2);

        // students[1] = "rahul dravid";
        students.set(1,"Rahul dravid");

        System.out.println(students.contains("amit kumar"));

        for(String s : students){
            System.out.println("Name : " + s);
        }
        System.out.println("Size :" + students.size());
    }
}