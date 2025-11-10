// Write a program to take an integer array nums of size n, and print the majority element. The majority element is the element that appears strictly more than ⌊n / 2⌋ times. Print -1 if no such element exists. Note: Majority Element is not necessarily the element that is present most number of times.
// Show Sample Test Cases
// Input 1:
// nums = [3,2,3]
// Output 1:
// 3
// Explanation 1:
// Size = 3, Count of 3 = 2 → 2 > 3/2. Thus, 3 is the majority element.
// Input 2:
// nums = [2,2,1,1,1,2,2]
// Output 2:
// 2
// Explanation 2:
// Size = 7, Count of 2 = 4 → 4 > 7/2. Thus, 2 is the majority element.
// Input 3:
// nums = [2,2,1,1,1,2,2,3]
// Output 3:
// -1
// Explanation 3:
// Size = 8, Count of 2 = 4 → 4 is not strictly greater than 8/2. Hence, no majority element exists.
// Follow-up (optional): Can you do it in O(n) Time Complexity?

import java.util.*;

public class Q1 {

    // Function to find the majority element
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find potential candidate (Boyer–Moore Voting Algorithm)
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) {
                freq++;
            }
        }

        // Check if frequency is strictly more than n/2
        if (freq > nums.length / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMajorityElement(nums);
        System.out.println("Output: " + result);

        sc.close();
    }
}
