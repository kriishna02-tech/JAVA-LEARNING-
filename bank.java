abstract class Account {

    private String accHolder;
    private int accNumber;
    protected double balance;

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    Account(String accHolder, int accNumber, double balance) {
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        balance += amount;
        System.out.println("₹" + amount + " Deposited Successfully");
    }

    abstract void withdraw(double amount);  // important line this will help to chosse which method will get called at runtime ,according to account type eg. saving or current.

    void transfer(Account receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Transfer Amount");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount; /// impotant concept that how we will call the recievr balance variable 

            System.out.println("Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double getBalance() {
        return balance;
    }

    void showDetails() {

        System.out.println("Bank           : " + bankName);
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Account Number : " + accNumber);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("----------------------------------");
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal");
            return;
        }

        if (balance - amount < 1000) {
            System.out.println("Minimum Balance Rule Violated");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal");
            return;
        }

        if (balance - amount >= -5000) {

            balance -= amount;
            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Overdraft Limit Exceeded");
        }
    }
}

public class bank {

    public static void main(String[] args) {

        Account[] accounts = new Account[3]; // this is also important

        accounts[0] = new SavingsAccount("Krishna", 1001, 10000);
        accounts[1] = new SavingsAccount("Rahul", 1002, 5000);
        accounts[2] = new CurrentAccount("Mohit", 1003, 2000);

        System.out.println("===== ACCOUNT DETAILS =====");

        for (Account account : accounts) {
            account.showDetails();
        }

        System.out.println("\n===== TRANSACTIONS =====");

        accounts[0].deposit(2000);

        accounts[1].withdraw(3500);

        accounts[2].withdraw(6000);

        accounts[0].transfer(accounts[2], 1500);

        System.out.println("\n===== UPDATED DETAILS =====");

        for (Account account : accounts) {
            account.showDetails();
        }

        System.out.println("Total Accounts : " + Account.totalAccounts);
    }
}