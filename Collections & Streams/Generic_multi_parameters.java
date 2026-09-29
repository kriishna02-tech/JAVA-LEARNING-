
class Box<T , Y>{
    private T num1;
    private Y num2;

    public void setValue(T val1 , Y val2){
        this.num1 = val1;
        this.num2 = val2;
    }

    public T getvalT(){
        return num1;
    }
    public Y getvalY(){
        return num2;
    }
    public Box<T, Y> getVal(){
        return this;
    }

}

public class Generic_multi_parameters {
    public static void main(String[] args) {
        Box<Integer , String> b1 = new Box<>();
        Box<Double , String> b2 = new Box<>();

        b1.setValue(10, "krishna kumar");
        System.out.println(b1.getvalT());
        System.out.println(b1.getvalT());
        System.out.println(b1.getVal());
        b2.setValue(20.0, "Orion spidy");
        System.out.println(b2.getvalT());
        System.out.println(b2.getvalY());
        System.out.println(b2.getVal());
    }
}
