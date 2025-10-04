// Write a program to find the LCM of two numbers.
// Show Sample Test Cases
// Input 1:
// 4 5
// Output 1:
// 20
// Input 2:
// 7 3
// Output 2:
// 21

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.print(lcm);
    }
}