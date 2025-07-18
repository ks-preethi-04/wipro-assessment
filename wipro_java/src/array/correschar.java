package array;
import java.util.Scanner;

public class correschar {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of ASCII values: ");
	        int n = sc.nextInt();
	        int[] ascii = new int[n];

	        System.out.println("Enter " + n + " ASCII values:");
	        for (int i = 0; i < n; i++)
	            ascii[i] = sc.nextInt();

	        System.out.println("Corresponding characters:");
	        for (int val : ascii)
	            System.out.print((char) val + " ");
	        
	        sc.close();
	    }
	}
