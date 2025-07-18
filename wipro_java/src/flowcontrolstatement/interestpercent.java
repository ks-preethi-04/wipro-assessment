
package flowcontrolstatement;
import java.util.Scanner;

public class interestpercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter gender:");
        String g = sc.nextLine().trim();  
        
        System.out.println("Enter age:");
        int a = sc.nextInt();

        if (g.equalsIgnoreCase("Female") && a > 1 && a < 58) {
            System.out.println("Percentage of interest is 8.2%");
        } else if (g.equalsIgnoreCase("Female") && a >= 58 && a < 100) {
            System.out.println("Percentage of interest is 9.2%");
        } else if (g.equalsIgnoreCase("Male") && a > 1 && a < 58) {
            System.out.println("Percentage of interest is 8.4%");
        } else if (g.equalsIgnoreCase("Male") && a >= 58 && a < 100) {
            System.out.println("Percentage of interest is 10.5%");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}

