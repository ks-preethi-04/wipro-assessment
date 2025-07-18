
package array;
import java.util.Scanner;
public class removeten_leftshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 10) {
                result[index++] = arr[i];
            }
        }

        System.out.print("Result: [");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if(i != n - 1) System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
 