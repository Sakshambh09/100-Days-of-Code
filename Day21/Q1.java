// Write a program to swap the first and last digit of a number.
// Show Sample Test Cases
// Input 1:
// 1234
// Output 1:
// 4231
// Input 2:
// 1001
// Output 2:
// 1001
// 🔁

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.length() == 1) {
            System.out.print(num);
            return;
        }
        char first = num.charAt(0);
        char last = num.charAt(num.length() - 1);
        String middle = num.substring(1, num.length() - 1);
        String swapped = last + middle + first;
        System.out.print(swapped);
    }
}