// Find the first repeating lowercase alphabet in a string.
// Show Sample Test Cases
// Input 1:
// stress
// Output 1:
// s

import java.util.*;

public class Q2 {
    public static char findFirstRepeating(String str) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (seen[index]) {
                    return c;
                } else {
                    seen[index] = true;
                }
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input1 = "stress";
        System.out.println(findFirstRepeating(input1));

        String input2 = "apple";
        System.out.println(findFirstRepeating(input2));
    }
}