import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ToDoList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(25);
        nums.add(30);
        nums.add(45);
        nums.add(50);

        List<Integer> temp = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("temp : " + temp);
    }
}



