// Write a program to classify a triangle as Equilateral, Isosceles, or Scalene based on its side lengths.
// Show Sample Test Cases
// Input 1:
// 3 3 3
// Output 1:
// Equilateral
// Input 2:
// 3 3 4
// Output 2:
// Isosceles
// Input 3:
// 2 3 4
// Output 3:
// Scalene

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}