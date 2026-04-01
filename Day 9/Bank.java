class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setHolderName(String name) {
        if (name != null && !name.isEmpty()) {
            this.holderName = name;
        }
    }

    // Business methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }
        System.out.println("Transaction failed!");
        return false;
    }
}

// Service class (handles operations)
class BankService {

    public void transfer(BankAccount from, BankAccount to, double amount) {
        System.out.println("\nInitiating transfer...");
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }
    }

    public void displayAccount(BankAccount acc) {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Holder Name: " + acc.getHolderName());
        System.out.println("Balance: " + acc.getBalance());
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount("101", "Arun", 1000);
        BankAccount acc2 = new BankAccount("102", "Kumar", 500);

        BankService service = new BankService();

        // Display initial details
        service.displayAccount(acc1);
        service.displayAccount(acc2);

        // Deposit & Withdraw
        acc1.deposit(300);
        acc2.withdraw(100);

        // Transfer money
        service.transfer(acc1, acc2, 400);

        // Final details
        service.displayAccount(acc1);
        service.displayAccount(acc2);
    }
}