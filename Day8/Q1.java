// Write a program to input a character and check whether it is an uppercase alphabet, lowercase alphabet, digit, or special character.
// Show Sample Test Cases
// Input 1:
// A
// Output 1:
// Uppercase alphabet
// Input 2:
// a
// Output 2:
// Lowercase alphabet
// Input 3:
// 3
// Output 3:
// Digit
// Input 4:
// #
// Output 4:
// Special character

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}