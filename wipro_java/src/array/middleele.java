package array;
import java.util.Scanner;
public class middleele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements of array A:");
        for (int i = 0; i < 3; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter 3 elements of array B:");
        for (int i = 0; i < 3; i++)
            b[i] = sc.nextInt();

        int[] result = {a[1], b[1]};

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
