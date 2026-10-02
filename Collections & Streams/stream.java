
import java.util.ArrayList;

public class stream {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(30);
        nums.add(45);
        nums.add(50);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        nums.stream()
        .filter(n->n%2==0)
        .forEach(n->System.out.println(n));
        
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        nums.stream()
        .filter(n-> n>40)
        .forEach(n -> System.out.println(n));


        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        nums.stream()
        .filter(n -> n%2==0 && n>30)
        .forEach(n -> System.out.println(n));
        
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
    }
}
