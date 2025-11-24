// Write a program to take an integer array as input. Only one element will be repeated. Print the repeated element. Try to find the result in one single iteration.
// Show Sample Test Cases
// Input 1:
// nums1 = [1,3,3,4]
// Output 1:
// 3
// Input 2:
// nums1 = [1,2,2]
// Output 2:
// 2
// Input 3:
// nums1 = [0,4,1,1,5]
// Output 3:
// 1

import java.util.*;

public class Q1 {
    public static int findRepeated(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (visited[val]) {
                return val;
            }
            visited[val] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int repeated = findRepeated(nums);
        System.out.println("Repeated element is: " + repeated);
    }
}