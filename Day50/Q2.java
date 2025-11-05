// Print all sub-strings of a string.
// Show Sample Test Cases
// Input 1:
// abc
// Output 1:
// a,ab,abc,b,bc,c

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!first)
                    System.out.print(",");
                System.out.print(s.substring(i, j));
                first = false;
            }
        }
    }
}
