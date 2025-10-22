// Find the sum of all elements in a matrix.
// Show Sample Test Cases
// Input 1:
// 2 3
// 1 2 3
// 4 5 6
// Output 1:
// 21

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}