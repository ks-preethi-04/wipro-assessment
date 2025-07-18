package flowcontrolstatement;

import java.util.Scanner;

public class checkoddoreven 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2 == 0)
		{
			System.out.println("The given integer is even");
		}
		else
		{
			System.out.println("The given integer is odd"); 	
		}
		sc.close();
	}

}
