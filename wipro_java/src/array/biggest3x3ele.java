package array;

public class biggest3x3ele {

    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] matrix = new int[3][3];
        int index = 0;
        int max = Integer.MIN_VALUE;

        // Fill the matrix and find max
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(args[index++]);
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("The biggest number is: " + max);
    }
}
