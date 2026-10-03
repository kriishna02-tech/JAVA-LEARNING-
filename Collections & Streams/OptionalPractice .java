import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {

    public static Optional<String> findName(List<String> names, String keyword) {

        for (String name : names) {
            if (name.equals(keyword)) {
                return Optional.of(name);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Krishna");
        names.add("Alex");
        names.add("Sam");
        names.add("John");

        Optional<String> result1 = findName(names, "Sam");
        Optional<String> result2 = findName(names, "David");

        System.out.println(result1.orElse("Not found"));
        System.out.println(result2.orElse("Not found"));
    }
}