import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 == 0;
        System.out.println(isEven.test(10));

        Consumer<String> printer = name -> System.out.println(name);
        printer.accept("Krishna");

        Function<String,Integer> strLen = text -> text.length();
        int length = strLen.apply("Java");
        System.out.println(length);
    }
}
