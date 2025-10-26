// Perform diagonal traversal of a matrix.
// Show Sample Test Cases
// Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output 1:
// 1 2 4 7 5 3 6 8 9

import java.util.*;

class Q1 {
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
        List<Integer> result = new ArrayList<>();
        for (int d = 0; d < rows + cols - 1; d++) {
            if (d % 2 == 0) {
                for (int i = Math.min(d, rows - 1); i >= 0; i--) {
                    int j = d - i;
                    if (j >= 0 && j < cols) {
                        result.add(matrix[i][j]);
                    }
                }
            } else {
                for (int i = 0; i <= Math.min(d, rows - 1); i++) {
                    int j = d - i;
                    if (j >= 0 && j < cols) {
                        result.add(matrix[i][j]);
                    }
                }
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}