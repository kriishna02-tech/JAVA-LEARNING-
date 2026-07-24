
public class TypeCasting {

    public static void main(String[] args) {

        // Explicit Type Casting (Narrowing)
        double d = 9.7;
        int x = (int) d;

        // Implicit Type Casting (Widening)
        int y = 10;
        double z = y;

        System.out.println("Original double : " + d);
        System.out.println("After casting to int : " + x);
        System.out.println("Original int : " + y);
        System.out.println("After casting to double : " + z);
    }
}