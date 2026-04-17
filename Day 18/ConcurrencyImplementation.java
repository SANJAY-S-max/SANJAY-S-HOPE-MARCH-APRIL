class bank {
    int bal = 1000;
    synchronized  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is going to withdraw");
        if(bal>=amount){
            bal -= amount;
            System.out.println("withdrawn "+amount);
            System.out.println("balance is "+bal);
        }
        else{
            System.out.println("Insufficient balance....");
        }
    }

    // @Override
    // public void run() {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}



public class ConcurrencyImplementation {
    public static void main(String[] args) throws InterruptedException {
        bank b = new bank();
        Runnable task = () -> {
            b.withdraw(700);
        };
        Thread t1 = new Thread(task,"User1");
        Thread t2 = new Thread(task,"User2");
        t1.start();
        // t1.join();
        t2.start();
    }   
}
