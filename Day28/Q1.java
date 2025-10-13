// Write a program to print all the prime numbers from 1 to n.
// Show Sample Test Cases
// Input 1:
// 10
// Output 1:
// 2 3 5 7
// Input 2:
// 20
// Output 2:
// 2 3 5 7 11 13 17 19

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}