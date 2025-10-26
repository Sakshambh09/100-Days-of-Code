// Multiply two matrices.
// Show Sample Test Cases
// Input 1:
// 2 3
// 1 2 3
// 4 5 6
// 3 2
// 7 8
// 9 10
// 11 12
// Output 1:
// 58 64
// 139 154

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int matrixA[][] = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int matrixB[][] = new int[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        if (colsA != rowsB) {
            System.out.println("Incompatible matrices for multiplication");
            return;
        }
        int result[][] = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}