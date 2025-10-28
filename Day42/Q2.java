// Convert a lowercase string to uppercase without using built-in functions.
// Show Sample Test Cases
// Input 1:
// hello
// Output 1:
// HELLO

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder upperStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                upperStr.append((char) (c - ('a' - 'A')));
            } else {
                upperStr.append(c);
            }
        }
        System.out.println(upperStr.toString());
    }
}