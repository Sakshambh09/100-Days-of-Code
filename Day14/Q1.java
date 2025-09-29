// Write a program to print the sum of the first n odd numbers.
// Show Sample Test Cases
// Input 1:
// 3
// Output 1:
// 9
// Input 2:
// 5
// Output 2:
// 25

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (2 * i - 1);
        }
        System.out.print(sum);
    }
}