// Write a program to take an integer array arr and an integer k as inputs. The task is to find the maximum element in each subarray of size k moving from left to right. Print the maximum elements for each window separated by spaces as output.
// Show Sample Test Cases
// Input 1:
// arr[1, 2, 3, 1, 4, 5, 2, 3, 6] = , k = 3
// Output 1:
// 3 3 4 5 5 5 6
// Explanation 1:
// 1st contiguous subarray , max = 3; 2nd contiguous subarray , max = 3; 3rd contiguous subarray , max = 4; 4th contiguous subarray , max = 5; 5th contiguous subarray , max = 5; 6th contiguous subarray , max = 5; 7th contiguous subarray , max = 6.
// Input 2:
// arr[5, 1, 3, 4, 2] = , k = 1
// Output 2:
// 5 1 3 4 2
// Explanation 2:
// When k = 1, each element in the array is its own subarray, so the output is simply the same array.

import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offerLast(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }
}
