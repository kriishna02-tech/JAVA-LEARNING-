public class Experiment2 {
    public static void main(String[] args) {

        // Student Details
        String name = "Krishna Kumar";
        int rollNo = 13;
        String className = "3A4";

        System.out.println("Name      : " + name);
        System.out.println("Roll No.  : " + rollNo);
        System.out.println("Class     : " + className);
        System.out.println();

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("(a > b) && (b > 0) : " + ((a > b) && (b > 0)));
        System.out.println("(a < b) || (b > 0) : " + ((a < b) || (b > 0)));
        System.out.println("!(a > b) : " + (!(a > b)));

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));

        // Assignment Operator
        int x = 10;
        x += 5;
        System.out.println("\nAssignment Operator");
        System.out.println("x += 5 : " + x);

        // Unary Operators
        int y = 5;
        System.out.println("\nUnary Operators");
        System.out.println("++y = " + (++y));
        System.out.println("--y = " + (--y));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator");
        System.out.println("Largest Number = " + max);
    }
}