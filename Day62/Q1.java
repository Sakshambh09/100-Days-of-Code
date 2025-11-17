// Write a program to take an integer array arr as input. The task is to find the maximum sum of any contiguous subarray using Kadane's algorithm. Print the maximum sum as output. If all elements are negative, print the largest (least negative) element.
// Show Sample Test Cases
// Input 1:
// arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output 1:
// 11
// Explanation 1:
// The subarray [7, -1, 2, 3] has the largest sum 11.
// Input 2:
// arr[] = [-2, -4]
// Output 2:
// -2
// Explanation 2:
// The subarray [-2] has the largest sum -2.
// Input 3:
// arr[] = [5, 4, 1, 7, 8]
// Output 3:
// 25
// Explanation 3:
// The subarray has the largest sum 25.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int curr = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSoFar = Math.max(maxSoFar, curr);
        }

        System.out.println(maxSoFar);
    }
}
