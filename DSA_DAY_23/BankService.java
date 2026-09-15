package DSA_DAY_23;

public class BankService {
    
    public static void main(String[] args) {
        
        Account account = new Account();
        account.setAccountHolder("Arpit");
        account.deposit(34700);
        account.withdraw(4000);
        account.deposit(-2000);
        account.withdraw(10000);
    }
}

class Account {
    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("You have deposited " + amount + " Rs.");
            System.out.println("New Balance is " + getBalance() + " Rs.");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("You have withdraw " + amount + " Rs.");
            System.out.println("New Balance is " + getBalance() + " Rs.");
        } else {
            System.out.println("Invalid or Insufficient balance for withdrawal");
        }
    }
}
