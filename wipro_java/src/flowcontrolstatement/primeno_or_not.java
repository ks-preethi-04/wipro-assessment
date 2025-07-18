
	package flowcontrolstatement;

	import java.util.Scanner;

	public class primeno_or_not {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int count=0;
	       if(n<=1) {
	    	   System.out.println("It is not a Prime");
	       }else {
	       for(int i=2;i<=Math.sqrt(n);i++) {
	    	   if(n%i==0) {
	    		   count ++;
	    		   break;
	    	   }
	         }
	       }
	    	   if(count==0) {
	    		   System.out.println("It is a Prime");
	    	   } 
	       else {
			   System.out.println("It is not a Prime");
	       }
	    	   sc.close();
		}
	}

