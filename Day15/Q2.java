// Write a program to reverse a given number.
// Show Sample Test Cases
// Input 1:
// 1234
// Output 1:
// 4321
// Input 2:
// 100
// Output 2:
// 1

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.print(rev);
    }
};