import java.util.*;
public class lamda_method {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(40);
        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(50);

        System.out.println("without sorting");
        System.out.println(nums);
        nums.sort((a,b)-> Integer.compare(a,b));
        System.out.println(nums);
    }
}
