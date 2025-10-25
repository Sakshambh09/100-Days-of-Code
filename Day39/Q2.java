// Find the sum of main diagonal elements for a square matrix.
// Show Sample Test Cases
// Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output 1:
// 15

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println(diagonalSum);
    }
}