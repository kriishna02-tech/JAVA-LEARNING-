import  java.util.Scanner;

public  class BasicFunctions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter string : ");

        String str = sc.nextLine();
        int i = sc.nextInt();
        System.out.println("length of str : " + str.length());
        System.out.println("Character at " +i + " : " + str.charAt(i) );
        System.out.println("Str in upper case : " + str.toUpperCase());
        System.out.println("Str in lower case : " + str.toLowerCase());
        System.out.println("Trim  : " + str.trim());   // it removes the space from the begining if the string "   krishna kumar" => "krishna kunmar"
        System.out.println("T/F : " + str.isEmpty());
    }
}