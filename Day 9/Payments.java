// Payment interface
interface Payment {
    void pay(double amount);
}

// Cash payment class
class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

// UPI payment class
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI Payment");
    }
}

// Credit card payment class
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// Debit card payment class
class DebitCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

// Main class
public class Payments {
    public static void main(String[] args) {
        // Using different payment methods
        Payment cash = new Cash();
        Payment upi = new UPIPayment();
        Payment credit = new CreditCard();
        Payment debit = new DebitCard();

        // Making payments
        cash.pay(1000);
        upi.pay(2500);
        credit.pay(5000);
        debit.pay(3000);
    }
}