// Write a program to find the sum of digits of a number.
// Show Sample Test Cases
// Input 1:
// 123
// Output 1:
// 6
// Input 2:
// 999
// Output 2:
// 27

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.print(sum);
    }
}