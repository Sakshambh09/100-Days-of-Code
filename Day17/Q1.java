// Write a program to check if a number is an Armstrong number.
// Show Sample Test Cases
// Input 1:
// 153
// Output 1:
// Armstrong
// Input 2:
// 123
// Output 2:
// Not Armstrong

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, digits);
            n = n / 10;
        }
        if (original == sum) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }
}