// Write a program to print the following pattern:
//     5
//    45
//   345
//  2345
// 12345
// Show Sample Test Cases
// Input 1:
// Output 1:
//     5
//    45
//   345
//  2345
// 12345

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}