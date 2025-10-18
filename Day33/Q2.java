// Insert an element in a sorted array at the appropriate position.
// Show Sample Test Cases
// Input 1:
// 5
// 1 2 4 5 6
// 3
// Output 1:
// 1 2 3 4 5 6

import java.util.*;
class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int elementToInsert = sc.nextInt();
        
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > elementToInsert); i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = elementToInsert;
        
        for (int j = 0; j <= n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}