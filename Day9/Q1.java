// Write a program to find the roots of a quadratic equation and categorize them.
// Show Sample Test Cases
// Input 1:
// 1 -3 2
// Output 1:
// Roots are real and different: 2, 1
// Input 2:
// 1 -2 1
// Output 2:
// Roots are real and same: 1
// Input 3:
// 1 2 5
// Output 3:
// Roots are complex

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Roots are real and different: " + (int) r1 + ", " + (int) r2);
        } else if (d == 0) {
            double r = (-b) / (2.0 * a);
            System.out.println("Roots are real and same: " + (int) r);
        } else {
            System.out.println("Roots are complex");
        }
    }
}