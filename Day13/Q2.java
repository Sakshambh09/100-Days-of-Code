// Write a program to print numbers from 1 to n.
// Show Sample Test Cases
// Input 1:
// 5
// Output 1:
// 1 2 3 4 5
// Input 2:
// 3
// Output 2:
// 1 2 3

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}