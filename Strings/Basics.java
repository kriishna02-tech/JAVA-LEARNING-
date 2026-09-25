public class Basics {
    public static void main(String[] args) {

        // 1. String Literal
        String s1 = "Hello";

        // 2. Using new Keyword
        String s2 = new String("Hello");

        // 3. Using Character Array
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(ch);

        // 4. Using Byte Array
        byte[] b = {72, 101, 108, 108, 111};   // 72 =H ,  this is ascii values
        String s4 = new String(b);

        // 5. Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        String s5 = sb.toString();

        // 6. Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        String s6 = sbf.toString();

        // 7. Using String.valueOf()
        int num = 100;
        String s7 = String.valueOf(num);

        // 8. Using String.format()
        String s8 = String.format("Name: %s, Age: %d", "John", 25);

        // 9. Using String.join()
        String s9 = String.join("-", "Java", "Python", "C++");

        // 10. Using Concatenation (+)
        String first = "Hello";
        String second = "World";
        String s10 = first + " " + second;

        // Display all Strings
        System.out.println("1. String Literal       : " + s1);
        System.out.println("2. new String()         : " + s2);
        System.out.println("3. Character Array      : " + s3);
        System.out.println("4. Byte Array           : " + s4);
        System.out.println("5. StringBuilder        : " + s5);
        System.out.println("6. StringBuffer         : " + s6);
        System.out.println("7. String.valueOf()     : " + s7);
        System.out.println("8. String.format()      : " + s8);
        System.out.println("9. String.join()        : " + s9);
        System.out.println("10. Concatenation (+)   : " + s10);
    }
}