// Write a program to find the 1’s complement of a binary number and print it.
// Show Sample Test Cases
// Input 1:
// 1010
// Output 1:
// 0101
// Input 2:
// 1111
// Output 2:
// 0000

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        StringBuilder onesComplement = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.out.print("Invalid input");
                return;
            }
        }
        System.out.print(onesComplement.toString());
    }
}