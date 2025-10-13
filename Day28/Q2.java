// Read and print elements of a one-dimensional array.
// Show Sample Test Cases
// Input 1:
// 3
// 10 20 30
// Output 1:
// 10 20 30
// Input 2:
// 5
// 1 2 3 4 5
// Output 2:
// 1 2 3 4 5

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}