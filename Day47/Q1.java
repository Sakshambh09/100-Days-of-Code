// Check if two strings are anagrams of each other.
// Show Sample Test Cases
// Input 1:
// listen
// silent
// Output 1:
// Anagrams
// Input 2:
// hello
// world
// Output 2:
// Not anagrams

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (areAnagrams(s1, s2))
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}