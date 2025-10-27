// Print each character of a string on a new line.
// Show Sample Test Cases
// Input 1:
// Hi
// Output 1:
// H
// i

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}