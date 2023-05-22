public class ATM {

    //synchronized method stop thread from interfering with object data at the same time
    static synchronized void withdraw(BankAccount account, int amount){
        int balance = account.getBalance();
        if((balance - amount) < - account.getOverdraft()){
            System.out.println("Transaction Denied! ");
        }
        else{
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
