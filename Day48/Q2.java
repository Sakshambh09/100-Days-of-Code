// Reverse each word in a sentence without changing the word order.
// Show Sample Test Cases
// Input 1:
// I love coding
// Output 1:
// I evol gnidoc

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
