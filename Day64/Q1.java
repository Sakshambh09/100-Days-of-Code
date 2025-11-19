// Write a program to take a string s as input. The task is to find the length of the longest substring without repeating characters. Print the length as output.
// Show Sample Test Cases
// Input 1:
// s = "abcabcbb"
// Output 1:
// 3
// Explanation 1:
// The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Input 2:
// s = "bbbbb"
// Output 2:
// 1
// Explanation 2:
// The answer is "b", with the length of 1.
// Input 3:
// s = "pwwkew"
// Output 3:
// 3
// Explanation 3:
// The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.*;

public class Q1 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}
