package flowcontrolstatement;

import java.util.Scanner;

public class palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int p=0;
     while(n!=0) {
    	 int sum=n%10;
    	 p=p*10+sum;
    	 n=n/10;
     }
     if(p==n) {
    	 System.out.println("It is a palindrome");
     }
     else {
    	 System.out.println("It is not a Palindrome");
     }
     sc.close();
	}

}