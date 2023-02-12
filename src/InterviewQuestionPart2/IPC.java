package InterThreadProcessCommunication;

public class Customer {

    int amount=10000;
    synchronized void deposit(int providedAmount) {

        System.out.println("Going to deposit :" + providedAmount);
        this.amount+=providedAmount;
        System.out.println(" Deposit completed , Now current balance is : "+amount);
        notify();  //Always notify is in synchronized block
    }

    synchronized void withdraw(int withdrawAmount) throws InterruptedException {

        if(this.amount<withdrawAmount){
            System.out.println("Balance is less hence can't withdraw please wait for someone to deposit money in the account ");
            wait();
        }
        System.out.println(" Money withdrawn started ");
        this.amount-=withdrawAmount;
        System.out.println(" Money withdrawn successfully and now money left  is  :"+amount);


    }
}


//First Create the Customer class and Thread t2 and then deposit method
class Test{
    public static void main(String[] args) {
        Customer c = new Customer();

        Thread t1 = new Thread(){
            public void run(){
                try {
                    c.withdraw(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        t1.start();

        Thread t2 = new Thread(){
           public void run() {
               c.deposit(10000);
           }
        };

        t2.start();
    }

}
