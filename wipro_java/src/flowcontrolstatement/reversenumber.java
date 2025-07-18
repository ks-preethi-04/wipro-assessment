package flowcontrolstatement;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    
     while(n!=0) {
    	 int rev=n%10;
    	 System.out.print(rev);
    	 n=n/10;
      }
     sc.close();
	}
}