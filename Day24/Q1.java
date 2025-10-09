// Write a program to print the following pattern:
// *
// **
// ***
// ****
// *****
// Show Sample Test Cases
// Input 1:
// Output 1:
// *
// **
// ***
// ****
// *****
// 🔄

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}