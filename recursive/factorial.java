import java.util.*;

/* input format for paiza
num               ... number.

if you input number : 60 or higher, then Overflow is occurred.
*/

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = (long) sc.nextInt();
        long result = 0;
        
        try {
            result = factorial(num);
            System.out.println(result);
        } catch (OverflowException e) {
            System.out.println("OverFlow was occurred.");
            System.out.println(String.format("Input Number was %d.", num));
        }
    }
    
    public static long factorial (long num) throws OverflowException{
        long result = 1;
        
        try {
            if (num == 0) {
                return result;
            } else {
                result = num * factorial(num - 1);
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
