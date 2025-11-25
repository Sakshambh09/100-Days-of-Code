// Write a program to take a string input. Change it to sentence case.
// Show Sample Test Cases
// Input 1:
// str = I am trying to build logic.
// Output 1:
// I Am Trying To Build Logic
// Input 2:
// str = The classes are supposed to start early.
// Output 2:
// The Classes Are Supposed To Start Early.
// Input 3:
// str = We are going to look at 26 different test cases.
// Output 3:
// We Are Going To Look At 26 Different Test Cases.

import java.util.*;

public class Q1 {
    public static String toSentenceCase(String str) {
        String result = "";
        boolean startWord = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result += ch;
                startWord = true;
            } else {
                if (startWord) {
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32);
                    }
                    startWord = false;
                } else {
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char) (ch + 32);
                    }
                }
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String output = toSentenceCase(str);
        System.out.println(output);
    }
}