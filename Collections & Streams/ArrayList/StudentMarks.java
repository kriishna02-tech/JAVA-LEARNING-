
import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(39);
        marks.add(51);
        marks.add(55);
        marks.add(85);
        marks.add(81);
        marks.add(91);
        marks.add(74);
        marks.add(54);
        int sumMarks = 0;
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;
        int count = 0;
        for (int m : marks) {
            System.out.println("Makrs : " + m);
            if (m > highestMarks) {
                highestMarks = m;
            }
            if (m < lowestMarks) {
                lowestMarks = m;
            }
            if (m >= 60) {
                count++;
            }
            sumMarks += m;
        }
        System.out.println("Highest marks : " + highestMarks);
        System.out.println("Lowest marks : " + lowestMarks);
        System.out.println("Average marks : " + (double)sumMarks / marks.size());
        System.out.println("No of student score more than 60 : " + count);
        for (int i = marks.size()-1 ; i >=0  ; i--) {
            if (marks.get(i) < 40) {
                marks.remove(i);
            }
        }
        for(int m : marks){
            System.out.print(m + " ");
        }
    }
}
