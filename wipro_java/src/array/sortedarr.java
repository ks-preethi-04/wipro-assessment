package array;
import java.util.*;
public class sortedarr
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        Arrays.sort(arr);

	        System.out.println("Sorted Array:");
	        for (int num : arr)
	            System.out.print(num + " ");
	        sc.close();
	    }
	}


