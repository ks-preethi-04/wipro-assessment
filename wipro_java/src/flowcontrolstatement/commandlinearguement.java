
package flowcontrolstatement;

public class commandlinearguement 
{

	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println(args[0]+","+args[1]);
		}

	}

}
