// Write a program to convert temperature from Celsius to Fahrenheit.
// Show Sample Test Cases
// Input 1:
// 0
// Output 1:
// Fahrenheit=32
// Input 2:
// 100
// Output 2:
// Fahrenheit=212

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Fahrenheit=" + f);
    }
}