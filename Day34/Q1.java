// Insert an element in an array at a given position.
// Show Sample Test Cases
// Input 1:
// 4
// 10 20 30 40
// 2 15
// Output 1:
// 10 20 15 30 40

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        int elementToInsert = sc.nextInt();
        for (int i = n - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = elementToInsert;
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}