// Find the sum of array elements.
// Show Sample Test Cases
// Input 1:
// 4
// 2 4 6 8
// Output 1:
// 20
// Input 2:
// 3
// 1 1 1
// Output 2:
// 3

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}