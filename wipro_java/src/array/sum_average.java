package array;
import java.util.Scanner;
public class sum_average 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int n,sum=0,avg;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++)
{
 arr[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++)
{
 sum=sum+arr[i];
	
}
avg=sum/n;
System.out.println(sum);
System.out.println(avg);


sc.close();
	}

}
