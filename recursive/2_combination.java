import java.util.*;

/* input format for paiza
n k               ... k-combination of n 
*/

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = (long) sc.nextInt();
        long limit = (long) sc.nextInt();
        
        long result = 0;
        
        try {
            result = factorial(num, limit) / factorial(limit, 1);
            System.out.println(result);
        } catch (OverflowException e) {
            System.out.println("OverFlow was occurred.");
            System.out.println(String.format("Input Numbers were %d and %d.", num, limit));
        }
    }
    
    public static long factorial (long num, long limit) throws OverflowException{
        long result = 1;
        
        try {
            if (num < limit) {
                return result;
            } else {
                result = num * factorial(num - 1, limit);
            }
        } catch (OverflowException e) {
            throw new OverflowException();
        }
        
        if (result < 0) {
            throw new OverflowException();
        }
        
        return result;
    }
}

class OverflowException extends RuntimeException {}
