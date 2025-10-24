// Check if a matrix is symmetric.
// Show Sample Test Cases
// Input 1:
// 2 2
// 1 2
// 2 1
// Output 1:
// True
// Input 2:
// 2 2
// 1 0
// 2 1
// Output 2:
// False

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
        boolean isSymmetric = true;
        if (rows != cols) {
            isSymmetric = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric) {
                    break;
                }
            }
        }
        System.out.println(isSymmetric ? "True" : "False");
    }
}