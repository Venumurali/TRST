/**
 * 
 */
package Factorial;
 public class Factorial {

    /**
     * This method finds the factorial of a value n. If n is in the range of 
     * 1 to 20 (inclusive) and retuns the factorial otherwise -1
     * @param n, the integer n.
     * @return factorial of n if n is in 1 to 20 (inclusive) and -1 otherwise.
     */
    public static long factorial(int n) {
        long fact=1;
        int i;
        if(n<=20 && n>=0)
        {
             for(i=2;i<=n;i++)
            {
                fact=fact*i;
            }   
            return(fact);
        }
    return -1;
    }

 }