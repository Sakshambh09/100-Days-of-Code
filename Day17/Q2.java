// Write a program to check if a number is prime.
// Show Sample Test Cases
// Input 1:
// 7
// Output 1:
// Prime
// Input 2:
// 10
// Output 2:
// Not prime

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.print("Prime");
        } else {
            System.out.print("Not prime");
        }
    }

}