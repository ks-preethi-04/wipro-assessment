package array;
import java.util.Scanner;

public class findingelement {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        System.out.print("Enter number to search: ");
	        int search = sc.nextInt();

	        int index = -1;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == search) {
	                index = i;
	                break;
	            }
	        }

	        System.out.println("Index: " + index);
	        sc.close();
	    }
	}
