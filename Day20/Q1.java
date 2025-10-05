// Write a program to find the product of odd digits of a number.
// Show Sample Test Cases
// Input 1:
// 12345
// Output 1:
// 15 (1*3*5)
// Input 2:
// 2468
// Output 2:
// 1 (no odd digits, assume 1)

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        boolean hasOdd = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOdd = true;
            }
            n /= 10;
        }
        if (!hasOdd) {
            product = 1; // If no odd digits, return 1 as per the problem statement
        }
        System.out.print(product);
    }
}