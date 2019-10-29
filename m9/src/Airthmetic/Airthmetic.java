package Airthmetic;

public class Airthmetic {
    public static void main(String[] args){
        Add i=new Add();
        Subtract s=new Subtract();
        Multiply m=new Multiply();
        Divide d=new Divide();
        System.out.println("add"+i.performOperation(10,25));
        System.out.println("add"+i.getOperation());
        System.out.println("Subtract"+s.performOperation(50,25));
        System.out.println("Subtract"+s.getOperation());
        System.out.println("Multiply"+m.performOperation(36,25));
        System.out.println("Multiply"+m.getOperation());
        System.out.println("divide"+d.performOperation(100,25));
        System.out.println("divide"+d.getOperation());
       


    }
    
}