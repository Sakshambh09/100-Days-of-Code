// Write a program to take two strings s and t as inputs (assume all characters are lowercase). The task is to determine if s and t are valid anagrams, meaning they contain the same characters with the same frequencies. Print "Anagram" if they are, otherwise "Not Anagram".
// Show Sample Test Cases
// Input 1:
// s = "anagram", t = "nagaram"
// Output 1:
// Anagram
// Explanation 1:
// The strings contain the same characters with the same frequencies.
// Input 2:
// s = "rat", t = "car"
// Output 2:
// Not Anagram
// Explanation 2:
// The strings do not contain the same characters.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s, t) ? "Anagram" : "Not Anagram");
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int x : freq)
            if (x != 0)
                return false;
        return true;
    }
}
