
import java.util.ArrayList;

public class StreamReduce {

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
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum : " + sum);
        System.out.println("Sum " + nums.stream().reduce(0, (a, b) -> a + b));
    }
}
