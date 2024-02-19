import java.util.Scanner;

public class matrix_Operations {
    public static void mat_Input(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
    }

    public static void print_mat(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void print_mat(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];

        System.out.println("Enter elements for matrix A:");
        mat_Input(matrixA);

        System.out.println("Enter elements for matrix B:");
        mat_Input(matrixB);

        int[][] sum = new int[3][3];
        int[][] sub = new int[3][3];
        int[][] multi = new int[3][3];
        double[][] div = new double[3][3];

        // Calculating summations
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Calculating submissions
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sub[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        // Calculating multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    multi[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Calculating division
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                div[i][j] = (double) matrixA[i][j] / matrixB[i][j];
            }
        }

        System.out.println("Matrix A:");
        print_mat(matrixA);
        System.out.println("Matrix B:");
        print_mat(matrixB);
        System.out.println("Summation:");
        print_mat(sum);
        System.out.println("Submission:");
        print_mat(sub);
        System.out.println("Multiplication:");
        print_mat(multi);
        System.out.println("Division:");
        print_mat(div);
    }

    
}
