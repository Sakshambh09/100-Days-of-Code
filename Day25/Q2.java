// Write a program to print the following pattern:
// *****
//  ****
//   ***
//    **
//     *
// Show Sample Test Cases
// Input 1:
// Output 1:
// *****
//  ****
//   ***
//    **
//     *
// Input 2:
// Output 2:
// Note: Spaces indicate indentation.

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}