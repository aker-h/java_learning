import java.util.*;

/* input format for paiza
n               ... Array`s element count
A_1 A_2 ... A_n ... Array`s elemets  
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        //printArray(A);
        
        for (int i = 1; i < n; i++) {
            task :
            for (int j = i; j > 0; j--) {
                int temp = 0;
                
                if (A[j] < A[j - 1]) {
                    temp     = A[j];
                    A[j]     = A[j - 1];
                    A[j - 1] = temp;
                }
            }
            
            printArray(A);
        }
    }
    
    private static void printArray (int[] array) {
        String line = "";
        
        for (int i : array) {
            line += Integer.toString(i) + " ";
        }
        
        line = line.trim();
        
        System.out.println(line);
    }
}
