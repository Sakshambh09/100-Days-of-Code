// Write a program to print the product of even numbers from 1 to n.
// Show Sample Test Cases
// Input 1:
// 4
// Output 1:
// 8 (2 * 4)
// Input 2:
// 6
// Output 2:
// 48 (2 * 4 * 6)

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                product = product * i;
            }
        }
        System.out.print(product);
    }
}