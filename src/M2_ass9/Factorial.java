package M2_ass9;

/**
 * 
 */

 public class Factorial {

    /**
     * This method finds the factorial of a value n. If n is in the range of 
     * 1 to 20 (inclusive) and retuns the factorial otherwise -1
     * @param n, the integer n.
     * @return factorial of n if n is in 1 to 20 (inclusive) and -1 otherwise.
     */
    public static long factorial(int n) {
        if(n==0){
            return 1;
        }
        else if(n>=21 || n<=0){
            return -1;
        }
        else
            {
            return(n * factorial(n-1));
        }

    }

 }