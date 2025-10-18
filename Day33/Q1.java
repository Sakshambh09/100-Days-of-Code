// Search in a sorted array using binary search.
// Show Sample Test Cases
// Input 1:
// 5
// 1 3 5 7 9
// 7
// Output 1:
// Found at index 3
// Input 2:
// 5
// 1 3 5 7 9
// 6
// Output 2:
// -1

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}