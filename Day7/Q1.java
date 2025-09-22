// Write a program to input a year and check whether it is a leap year or not using conditional statements.
// Show Sample Test Cases
// Input 1:
// 2020
// Output 1:
// Leap year
// Input 2:
// 1900
// Output 2:
// Not a leap year
// Input 3:
// 2000
// Output 3:
// Leap year
// Year is a leap year if divisible by 4 but not 100, except if divisible by 400.

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

}
