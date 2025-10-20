// Delete an element from an array.
// Show Sample Test Cases
// Input 1:
// 5
// 1 2 3 4 5
// 2
// Output 1:
// 1 2 4 5

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positionToDelete = sc.nextInt();
        for (int i = positionToDelete; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}