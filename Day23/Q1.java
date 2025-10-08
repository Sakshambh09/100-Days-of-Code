// Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.
// Show Sample Test Cases
// Input 1:
// 3
// Output 1:
// Approximate sum: 1.56
// Input 2:
// 5
// Output 2:
// Approximate sum: 2.22

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            int numerator = 2 * i;
            int denominator = 3 + (i - 1) * 4;
            sum += (double) numerator / denominator;
        }
        System.out.printf("Approximate sum: %.2f\n", sum);
        sc.close();
    }
}