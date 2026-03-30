import java.util.*;
class bankAccount{
    double balance=0;
    void deposite(double amount){
        balance+=amount;
        System.out.println("Amount deposited: "+amount); 
    }
    void withdraw(double amount){
        if(balance-amount<0){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println("Amount withdrawed: "+amount);
    }
    void getBalance(){
        System.out.println("Balance is "+balance);
    }
}

public class BankProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bankAccount p1 = new bankAccount();
        double amount;
        while(true){
            System.out.print("1.Deposite\n2.Withdraw\n3.Display balance\n4.Exit\n");
            int op = sc.nextInt();
            switch(op) {
              case 1:
                  System.out.print("Enter amount to deposite in account:");
                  amount = sc.nextDouble();
                  p1.deposite(amount);
                  p1.getBalance();
                  break; 
              case 2:
                  System.out.print("Enter amount to withdraw from account:");
                  amount = sc.nextDouble();
                  p1.withdraw(amount);
                  p1.getBalance();
                  break;
              case 3:
                  p1.getBalance();
                  break;
              case 4:
                  System.exit(0);   
              
              default:
                  System.out.println("Invalid option");
                  break;
            }
        }   
    }
}
