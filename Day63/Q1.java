
// Write a program to take an integer array arr and an integer k as inputs. The task is to find the kth smallest element in the array. Print the kth smallest element as output.
// Show Sample Test Cases
// Input 1:
// arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
// Output 1:
// 5
// Explanation 1:
// 4th smallest element in the given array is 5.
// Input 2:
// arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output 2:
// 7
// Explanation 2:
// 3rd smallest element in the given array is 7.

import java.util.*;

public class Q1 {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean result = hasDuplicate(nums);
        if (result) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("All elements are distinct");
        }
        sc.close();
    }
}