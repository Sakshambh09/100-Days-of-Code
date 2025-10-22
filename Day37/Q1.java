// Find the sum of each row of a matrix and store it in an array.
// Show Sample Test Cases
// Input 1:
// 2 3
// 1 2 3
// 4 5 6
// Output 1:
// 6 15

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        int rowSums[] = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                rowSums[i] += matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.print(rowSums[i] + " ");
        }
    }
}