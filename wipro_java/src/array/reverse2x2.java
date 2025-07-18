package array;

public class reverse2x2 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] matrix = new int[2][2];
        int index = 0;

        // Fill the matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(args[index++]);
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}

