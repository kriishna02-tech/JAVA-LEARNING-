import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class PredicatePractice {
    public static void main(String[] args) {
        Predicate<Integer> greater = n -> n>=50;
        System.out.println(greater.test(76));
        System.out.println(greater.test(29));

        Consumer<String> greet  = name -> System.out.println("Hello " + name);
        greet.accept("krishna kumar");

        Function<Integer,Integer> sq = num -> num*num;
        System.out.println(sq.apply(5));
    }
}
