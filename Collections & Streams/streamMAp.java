import java.util.ArrayList;

public class streamMAp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(30);
        nums.add(45);
        nums.add(50);
       
        nums.stream()
        .map(n -> n*n)
        .forEach(n->System.out.println(n));
        
        
    }
}
