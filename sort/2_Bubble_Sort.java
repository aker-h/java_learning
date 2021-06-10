import java.util.*;

/* input format for paiza
n               ... Array`s element count
A_1 A_2 ... A_n ... Array`s elemets  
*/

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //printArray(array);
        
        for (int i = 0; i < (n - 1); i++) {
            for (int j = (n - 1); j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            printArray(array);
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
