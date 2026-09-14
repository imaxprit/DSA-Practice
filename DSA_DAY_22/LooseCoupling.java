package DSA_DAY_22;

import java.util.Scanner;

public class LooseCoupling {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        PaymentCheckout checkout = new PaymentCheckout();

        System.out.println("Choose Payment Method: ");
        System.out.println("1. UPI");
        System.out.println("2. Net Banking");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkout.payment(new UPIPayment());
                break;
            case 2:
                checkout.payment(new NetBankingPayment());
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

interface Payment {
    void pay();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI.");
    }
}

class NetBankingPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using Net Banking.");
    }
}

class PaymentCheckout {
    void payment(Payment payment) {
        payment.pay();
    }
}





