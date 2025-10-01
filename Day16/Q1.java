// Write a program to take a number as input and print its equivalent binary representation.
// Show Sample Test Cases
// Input 1:
// 10
// Output 1:
// 1010
// Input 2:
// 7
// Output 2:
// 111
// 🔁

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        if (n == 0) {
            binary.append("0");
        }
        while (n > 0) {
            int rem = n % 2;
            binary.append(rem);
            n = n / 2;
        }
        System.out.print(binary.reverse().toString());
    }
}