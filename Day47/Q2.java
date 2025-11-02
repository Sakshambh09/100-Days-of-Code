// Find the longest word in a sentence.
// Show Sample Test Cases
// Input 1:
// I love programming
// Output 1:
// programming

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String longest = "";
        for (String w : words)
            if (w.length() > longest.length())
                longest = w;
        System.out.println(longest);
    }
}
