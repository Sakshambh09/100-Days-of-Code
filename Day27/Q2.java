// Write a program to print the following pattern:

//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
// Show Sample Test Cases
// Input 1:
// Output 1:
// Pattern with layers of stars as shown.

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // Number of layers in the upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}