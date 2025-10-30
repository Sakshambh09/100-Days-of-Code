// Count spaces, digits, and special characters in a string.
// Show Sample Test Cases
// Input 1:
// a b1&2
// Output 1:
// Spaces=1, Digits=2, Special=1

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int spaceCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                spaceCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                specialCount++;
            }
        }

        System.out.println("Spaces=" + spaceCount + ", Digits=" + digitCount + ", Special=" + specialCount);
    }
}