// Toggle case of each character in a string.
// Show Sample Test Cases
// Input 1:
// Hello
// Output 1:
// hELLO

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder toggledStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch);
            }
        }

        System.out.println(toggledStr.toString());
    }
}