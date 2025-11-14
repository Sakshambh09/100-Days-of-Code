// Write a program to take an integer array arr and an integer k as inputs. Print the maximum sum of all the subarrays of size k.
// Show Sample Test Cases
// Input 1:
// arr[100, 200, 300, 400] = , k = 2
// Output 1:
// 700
// Explanation 1:
// arr2 + arr3 = 700, which is maximum.
// Input 2:
// arr[1, 4, 2, 10, 23, 3, 1, 0, 20] = , k = 4
// Output 2:
// 39
// Explanation 2:
// arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
// Input 3:
// arr[100, 200, 300, 400] = , k = 1
// Output 3:
// 400
// Explanation 3:
// arr3 = 400, which is maximum.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(maxSumSubarray(arr, k));
        sc.close();
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length, sum = 0, maxSum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}