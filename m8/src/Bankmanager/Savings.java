package Bankmanager;

public class Savings extends Account{
   float interest_rate;

    public Savings(int acc, double balance,float d) {
        super(acc, balance);
        interest_rate=d;
        // TODO Auto-generated constructor stub
    }
    
    public double interest(){
       double percent = super.getBalance() * interest_rate;
       super.setBalance(percent+super.getBalance());
       return(super.getBalance());
    }
   
}
