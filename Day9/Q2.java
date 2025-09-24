// Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
// 90-100: Grade A 
// 80-89: Grade B 
// 70-79: Grade C 
// 60-69: Grade D 
// below 60: Grade F.
// Show Sample Test Cases
// Input 1:
// 95
// Output 1:
// Grade A
// Input 2:
// 82
// Output 2:
// Grade B
// Input 3:
// 68
// Output 3:
// Grade D
// Input 4:
// 50
// Output 4:
// Grade F

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("Grade A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("Grade B");
        } else if (n >= 70 && n <= 79) {
            System.out.println("Grade C");
        } else if (n >= 60 && n <= 69) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}