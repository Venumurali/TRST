package Bankmanager;

public class check extends Account
{
    double fee;

    public check(int acc, double balance, double fee) {
        super(acc, balance);
        this.fee = fee;
    }

    public boolean credit(double amount){
     if (super.credit(amount-fee)==true){
        
        return true;
     }
    else{
       return false;
    }
    }
public boolean debit(double amount){
        
          if (super.debit(amount+fee)==true){
        return true;
       }
    else{
        return false;
    }}
        
}
    
