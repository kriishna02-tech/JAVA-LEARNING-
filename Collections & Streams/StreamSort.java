
import java.util.ArrayList;

public class StreamSort {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(30);
        nums.add(45);
        nums.add(50);

        nums.stream()
                .sorted((a, b) -> Integer.compare(a, b))
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        nums.stream()
            .sorted((a,b) -> Integer.compare(b, a))
            .forEach(n-> System.out.print(n + " "));
    }
}
