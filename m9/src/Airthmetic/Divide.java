
package Airthmetic;

public class Divide implements operator{
    private String opString;
    public void Add() {
         opString = "/";
    }
    
public int performOperation(int num1, int num2) {
    return num1 / num2;
}
 public String getOperation() {
 return opString;
}
    }
    
