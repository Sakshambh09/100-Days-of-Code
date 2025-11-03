// Check if one string is a rotation of another.
// Show Sample Test Cases
// Input 1:
// abcde
// deabc
// Output 1:
// Rotation
// Input 2:
// abc
// acb
// Output 2:
// Not rotation

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("Rotation");
        else
            System.out.println("Not rotation");
    }
}
