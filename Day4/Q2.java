/* Write a program to find and display the sum of the first n natural numbers.
Show Sample Test Cases
Input 1:
5
Output 1:
Sum=15
Input 2:
10
Output 2:
Sum=55 */

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum=" + sum);
    }

}