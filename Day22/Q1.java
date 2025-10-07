// Write a program to check if a number is a strong number.
// Show Sample Test Cases
// Input 1:
// 145
// Output 1:
// Strong number
// Input 2:
// 123
// Output 2:
// Not strong number

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.print("Strong number");
        } else {
            System.out.print("Not strong number");
        }
    }
}