// Write a program to calculate the factorial of a number.
// Show Sample Test Cases
// Input 1:
// 5
// Output 1:
// 120
// Input 2:
// 3
// Output 2:
// 6

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }
}