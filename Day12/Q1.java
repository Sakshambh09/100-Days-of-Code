// Write a program to calculate library fine based on late days as follows: 
// First 5 days late: ₹2/day 
// Next 5 days late: ₹4/day 
// Next 20 days days late: ₹6/day 
// More than 30 days: Membership Cancelled.
// Show Sample Test Cases
// Input 1:
// 4
// Output 1:
// Fine ₹8
// Input 2:
// 8
// Output 2:
// Fine ₹22
// Input 3:
// 15
// Output 3:
// Fine ₹60
// Input 4:
// 31
// Output 4:
// Membership Cancelled

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int fine = 0;
        if (days <= 5) {
            fine = days * 2;
            System.out.println("Fine ₹" + fine);
        } else if (days > 5 && days <= 10) {
            fine = 10 + (days - 5) * 4;
            System.out.println("Fine ₹" + fine);
        } else if (days > 10 && days <= 30) {
            fine = 30 + (days - 10) * 6;
            System.out.println("Fine ₹" + fine);
        } else {
            System.out.println("Membership Cancelled");
        }
    }
}