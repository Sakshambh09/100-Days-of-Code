// Write a program to take an input array of size n. The array should contain all the integers between 0 to n except for one. Print that missing number
// Show Sample Test Cases
// Input 1:
// nums1 = [0,3,2,4]
// Output 1:
// 1
// Input 2:
// nums1 = [1,2,3]
// Output 2:
// 0
// Input 3:
// nums1 = [0,4,3,1,5]
// Output 3:
// 2

import java.util.Scanner;

class Q1 {
    public static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = missingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}