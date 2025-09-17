// Write a program to calculate the area and circumference of a circle given its radius.
// Show Sample Test Cases
// Input 1:
// 7
// Output 1:
// Area=153.94, Circumference=43.96
// Input 2:
// 3
// Output 2:
// Area=28.27, Circumference=18.85

import java.util.*;
import java.math.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double pie = Math.PI;
        double area = pie * r * r;
        double c = 2 * pie * r;
        System.out.println("Area=" + String.format("%.2f", area) + ", Circumference=" + String.format("%.2f", c));
    }
}