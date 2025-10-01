// Write a program to check if a number is a palindrome.
// Show Sample Test Cases
// Input 1:
// 121
// Output 1:
// Palindrome
// Input 2:
// 123
// Output 2:
// Not palindrome

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (original == rev) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not palindrome");
        }
    }
}