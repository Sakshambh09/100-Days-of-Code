// Write a Program to take a sorted array(say nums[]) and an integer (say target) as inputs. The elements in the sorted array might be repeated. You need to print the first and last occurrence of the target and print the index of first and last occurrence. Print -1, -1 if the target is not present.
// Show Sample Test Cases
// Input 1:
// nums = [5,7,7,8,8,10], target = 8
// Output 1:
// 3,4
// Input 2:
//  nums = [5,7,7,8,8,10], target = 6
// Output 2:
// -1,-1
// Input 3:
//  nums = [5,7,7,8,8,10], target = 10
// Output 3:
// 5,5
// Follow-up(optional): Can you do it in O(log n) Time Complexity?

import java.util.*;

public class Q1 {
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] { first, last };
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int target = sc.nextInt();
        int[] ans = searchRange(nums, target);
        System.out.println(ans[0] + "," + ans[1]);
    }
}
