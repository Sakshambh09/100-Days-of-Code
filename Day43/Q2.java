// Check if a string is a palindrome.
// Show Sample Test Cases
// Input 1:
// madam
// Output 1:
// Palindrome
// Input 2:
// hello
// Output 2:
// Not palindrome

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        if (str.equals(reversedStr.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}