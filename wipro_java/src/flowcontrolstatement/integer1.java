package flowcontrolstatement;
import java.util.Scanner;
public class integer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative number");
		}
		else if(n>0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Zero");
		}
sc.close();
	}

}
