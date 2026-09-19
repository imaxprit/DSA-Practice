package DSA_DAY_27;

public class BankAccount {
    public static void main(String args[]) {
        Account myAcc = new Account();
        myAcc.username = "Arpit Gupta";
        myAcc.setPassword("arpit12");

        System.out.println(myAcc.username);
    }
}

class Account {

    public String username;
    private String password;
    public void setPassword(String pass) {
        password = pass;
        System.out.println(password);
    }
}
