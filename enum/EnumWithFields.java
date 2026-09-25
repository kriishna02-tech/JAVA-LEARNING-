enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);   // constants call the constructor

    private final int value;                      // field to store cents

    Coin(int value) {                              // constructor (implicitly private)
        this.value = value;
    }

    public int getValue() {                        // getter
        return value;
    }
}

public class EnumWithFields {
    public static void main(String[] args) {
        for (Coin c : Coin.values()) {
            System.out.println(c.name() + " = " + c.getValue() + " cents");
        }
    }
}