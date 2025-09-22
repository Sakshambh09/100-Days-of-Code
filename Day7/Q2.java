// Write a program to input a character and check whether it is a vowel or consonant using if–else.
// Show Sample Test Cases
// Input 1:
// a
// Output 1:
// Vowel
// Input 2:
// b
// Output 2:
// Consonant

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}