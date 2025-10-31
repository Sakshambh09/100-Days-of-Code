// Count frequency of a given character in a string.
// Show Sample Test Cases
// Input 1:
// programming
// g
// Output 1:
// 2

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char targetChar = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println(count);
    }
}