// Write a program to print the following pattern:
// 5
// 45
// 345
// 2345
// 12345
// Show Sample Test Cases
// Input 1:
// Output 1:
// 5
// 45
// 345
// 2345
// 12345

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}