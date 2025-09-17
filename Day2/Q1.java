// Write a program to calculate the area and perimeter of a rectangle given its length and breadth.
// Show Sample Test Cases
// Input 1:
// 5 10
// Output 1:
// Area=50, Perimeter=30
// Input 2:
// 3 7
// Output 2:
// Area=21, Perimeter=20

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l * b;
        int p = 2 * (l + b);
        System.out.println("Area=" + area + ", Perimeter=" + p);
    }
}