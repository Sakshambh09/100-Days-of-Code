// Write a program to print the following pattern:
// *****
// *****
// *****
// *****
// *****
// Show Sample Test Cases
// Input 1:
// Output 1:
// *****
// *****
// *****
// *****
// *****

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // Number of rows
        int m = 5; // Number of columns
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}