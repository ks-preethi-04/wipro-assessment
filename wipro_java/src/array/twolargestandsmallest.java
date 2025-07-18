package array;
import java.util.Scanner;
import java.util.Arrays;
public class twolargestandsmallest {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        Arrays.sort(arr);

	        System.out.println("Two smallest: " + arr[0] + ", " + arr[1]);
	        System.out.println("Two largest: " + arr[n - 2] + ", " + arr[n - 1]);
	        sc.close();
	    }
	}
