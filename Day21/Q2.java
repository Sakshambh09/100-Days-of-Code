// Write a program to check if a number is a perfect number.
// Show Sample Test Cases
// Input 1:
// 6
// Output 1:
// Perfect number
// Input 2:
// 10
// Output 2:
// Not perfect number

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.print("Perfect number");
        } else {
            System.out.print("Not perfect number");
        }
    }
}