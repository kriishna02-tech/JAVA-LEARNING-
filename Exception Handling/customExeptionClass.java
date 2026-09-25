class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class InvalidAccountException extends Exception{
    InvalidAccountException(String message){
        super(message);
    }
}

class BankAccount{
    private  double balance = 0;

    public BankAccount(double balance) {
        this.balance  = balance;
    }

    public void withdraw(double balance) throws InsufficientBalanceException, InvalidAccountException{
        if(balance <= 0 ){
            throw new InvalidAccountException("balance connot be negative");
        }
        else if(balance > this.balance){
            throw new InsufficientBalanceException("insuffiecent money in the bank account");
        }
        this.balance -= balance;
        System.out.println("withdraw money : " + balance);
        System.out.println("Available balance  : " + this.balance);
    }

}

public class customExeptionClass{
    public static void main(String[] args) {
        BankAccount  obj = new BankAccount(1000);

        try{
            obj.withdraw(599);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        catch(InvalidAccountException e){
            System.out.println(e);
        }
        try{
            obj.withdraw(-300);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        catch(InvalidAccountException e){
            System.out.println(e);
        }
        try{
            obj.withdraw(4000);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        catch(InvalidAccountException e){
            System.out.println(e);
        }
    }
}