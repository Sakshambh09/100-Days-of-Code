// Write a program to swap two numbers using a third variable.
// Show Sample Test Cases
// Input 1:
// 3 5
// Output 1:
// After swap: 5 3
// Input 2:
// -1 1
// Output 2:
// After swap: 1 -1

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " + a + " " + b);
    }

}