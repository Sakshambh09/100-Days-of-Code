// Count characters in a string without using built-in length functions.
// Show Sample Test Cases
// Input 1:
// Hello
// Output 1:
// 5
// Input 2:

// Output 2:
// 1

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println(count);
    }
}