// Replace spaces with hyphens in a string.
// Show Sample Test Cases
// Input 1:
// hello world
// Output 1:
// hello-world

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder modifiedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                modifiedStr.append('-');
            } else {
                modifiedStr.append(ch);
            }
        }

        System.out.println(modifiedStr.toString());
    }
}