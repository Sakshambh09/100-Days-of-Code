// Write a program to input three numbers and find the largest among them using if–else.
// Show Sample Test Cases
// Input 1:
// 3 7 5
// Output 1:
// Largest is 7
// Input 2:
// -1 -5 0
// Output 2:
// Largest is 0

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Largest is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest is " + b);
        } else {
            System.out.println("Largest is " + c);
        }
    }
}