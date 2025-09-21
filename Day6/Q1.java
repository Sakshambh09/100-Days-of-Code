// Write a program to input an integer and check whether it is even or odd using if–else.
// Show Sample Test Cases
// Input 1:
// 7
// Output 1:
// 7 is odd
// Input 2:
// 12
// Output 2:
// 12 is even

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}