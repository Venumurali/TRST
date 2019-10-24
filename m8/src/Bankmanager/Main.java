package Bankmanager;
public class Main {
    public static void main(String[] args){
    Savings st=new Savings(1452,5000, 0.8f);
    Account at=new check(222, 54123, 20);
    System.out.println(at.getBalance());
    System.out.println(at.debit(1000));
    System.out.println(at.getBalance());
    System.out.println(st.interest());
    System.out.println(st.debit(1000));
     System.out.println(st.getBalance());
    }
}