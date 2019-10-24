package Bankmanager;

public class Account {
    int Accountno;
    private double balance;

   public Account(int acc,double balance){
       Accountno=acc;
       this.balance=balance;
   }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public boolean credit(double tot){
    balance=(tot + balance);
    return true;
}
public boolean debit(double amount){
         if (balance<amount) {
             System.out.println("insuffcients funds");
             return(false);
              }
       else{
            
            balance-=amount;
            return(true);
       }
        
}
}