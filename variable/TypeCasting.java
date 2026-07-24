// package variable;

public class TypeCasting {

    public static void main(String[] args) {
        double d = 9.7;
        int x = (int) d; 
        int y = 10;
        double z = y; // implicit widening
        System.out.println("D : " + d);
        System.out.println("X : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
    }
}
