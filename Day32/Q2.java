// Find the digit that occurs the most times in an integer number.
// Show Sample Test Cases
// Input 1:
// 112233
// Output 1:
// 1
// Input 2:
// 887799
// Output 2:
// 7

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        int freq[] = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            freq[ch - '0']++;
        }
        int maxFreq = 0;
        int resultDigit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                resultDigit = i;
            }
        }
        System.out.println(resultDigit);
    }
}