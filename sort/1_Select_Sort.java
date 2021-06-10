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
        
        for (int i = 0; i < n - 1; i++) {
            int minNum = 10000;
            int minLoc = 0;
            
            for (int j = i; j < n; j++) {
                if (array[j] < minNum) {
                    minNum = array[j];
                    minLoc = j;
                }
            }
            
            if (i != minLoc) {
                int temp = array[i];
                array[i] = array[minLoc];
                array[minLoc] = temp;
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
