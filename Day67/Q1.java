// Write a program to take two sorted arrays of size m and n as input. Merge both the arrays such that the merged array is also sorted. Print the merged array.
// Show Sample Test Cases
// Input 1:
// nums1 = [2,7,11,15] nums2 = [4,8,10]
// Output 1:
// 2 4 7 8 10 11 15
// Input 2:
// nums1 = [1,2,7] nums2 = [9,10,17]
// Output 2:
// 1 2 7 9 10 17
// Input 3:
// nums1 = [-10,-2,7] nums2 = [-3, -1, 7]
// Output 3:
// -10 -3 -2 -1 7 7

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++)
            nums1[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++)
            nums2[i] = sc.nextInt();
        int[] merged = merge(nums1, nums2);
        for (int x : merged) {
            System.out.print(x + " ");
        }
    }

    static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }
        while (i < a.length)
            ans[k++] = a[i++];
        while (j < b.length)
            ans[k++] = b[j++];
        return ans;
    }
}