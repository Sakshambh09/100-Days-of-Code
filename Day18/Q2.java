// Write a program to find the HCF (GCD) of two numbers.
// Show Sample Test Cases
// Input 1:
// 12 18
// Output 1:
// 6
// Input 2:
// 7 9
// Output 2:
// 1

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.print(a);
    }
}