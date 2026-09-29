import java.util.List;

public class GenericWildcards{

    public static double calculateTotal(List<? extends Number> list) {

        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30);
        List<Double> doubles = List.of(5.5, 10.5);

        System.out.println("Integer total: " + calculateTotal(integers));
        System.out.println("Double total: " + calculateTotal(doubles));
    }
}