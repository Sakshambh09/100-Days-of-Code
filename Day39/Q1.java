// Check if the elements on the diagonal of a matrix are distinct.
// Show Sample Test Cases
// Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 1
// Output 1:
// False
// Input 2:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output 2:
// True

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
        Set<Integer> diagonalElements = new HashSet<>();
        boolean allDistinct = true;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            if (diagonalElements.contains(matrix[i][i])) {
                allDistinct = false;
                break;
            }
            diagonalElements.add(matrix[i][i]);
        }
        System.out.println(allDistinct ? "True" : "False");
    }
}