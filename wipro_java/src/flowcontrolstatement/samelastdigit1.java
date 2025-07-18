package flowcontrolstatement;

import java.util.Scanner;

public class samelastdigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=n1%10;
		int n4=n2%10;
		if(n3==n4)
		{
			System.out.println("True");
	    }
		else
		{
			System.out.println("False");
		}
		sc.close();
	}

}
