public class Basicflowcontrol {
    public static  int   divide(int a ,int b){
        try{
            return   a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            return -1;
        }
        finally{
            System.out.println("cannot divide byu zero");
        }
    }

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println( divide(5,i-3));
        }
    }
}
