
class Calc<T extends Number>{
    private T a;
    private T b;

    public void setVal(T a , T b){
        this.a = a;
        this.b = b;
    }

    public double getVal(){
        // return a+b ;  wrong approch generic do not allow
        return a.doubleValue() + b.doubleValue();
    }
}
public class Generic_with_restiction {
    public static void main(String[] args) {
        Calc<Integer> c1 = new Calc<>();

        c1.setVal(10, 20);
        System.out.println("Addition : "+ c1.getVal());
    }
}
