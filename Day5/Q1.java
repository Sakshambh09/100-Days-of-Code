// Write a program to calculate simple and compound interest for given principal, rate, and time.
// Show Sample Test Cases
// Input 1:
// 1000 5 2
// Output 1:
// Simple Interest=100, Compound Interest=102.5
// Input 2:
// 5000 7 3
// Output 2:
// Simple Interest=1050, Compound Interest=1125.76

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        double ci = p * (Math.pow((1 + r / 100), t)) - p;
        System.out.println(
                "Simple Interest=" + String.format("%.0f", si) + ", Compound Interest=" + String.format("%.2f", ci));
    }
}