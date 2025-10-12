// Write a program to print the following pattern:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *
// Show Sample Test Cases
// Input 1:
// Output 1:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}