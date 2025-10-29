// Reverse a string.
// Show Sample Test Cases
// Input 1:
// abcd
// Output 1:
// dcba

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr.toString());
    }
}