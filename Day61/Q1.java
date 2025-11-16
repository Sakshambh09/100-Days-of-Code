// Write a program to take an integer array arr and an integer k as inputs. The task is to find the first negative integer in each subarray of size k moving from left to right. If no negative exists in a window, print "0" for that window. Print the results separated by spaces as output.
// Show Sample Test Cases
// Input 1:
// arr[] = [-8, 2, 3, -6, 10], k = 2
// Output 1:
// -8 0 -6 -6
// Explanation 1:
// Window [-8, 2] First negative integer is -8. Window No negative integers, output is 0. Window [3, -6] First negative integer is -6. Window [-6, 10] First negative integer is -6.
// Input 2:
// arr[] = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
// Output 2:
// -1 -1 -7 -15 -15 0
// Explanation 2:
// Window [12, -1, -7] First negative integer is -1. Window [-1, -7, 8] First negative integer is -1. Window [-7, 8, -15] First negative integer is -7. Window [8, -15, 30] First negative integer is -15. Window [-15, 30, 16] First negative integer is -15. Window No negative integers, output is 0.
// Input 3:
// arr[] = [12, 1, 3, 5], k = 3
// Output 3:
// 0 0
// Explanation 3:
// Window No negative integers, output is 0. Window No negative integers, output is 0.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                q.offer(i);

            while (!q.isEmpty() && q.peek() <= i - k)
                q.poll();

            if (i >= k - 1) {
                if (q.isEmpty())
                    System.out.print("0 ");
                else
                    System.out.print(arr[q.peek()] + " ");
            }
        }
    }
}
