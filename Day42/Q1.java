// Count vowels and consonants in a string.
// Show Sample Test Cases
// Input 1:
// hello
// Output 1:
// Vowels=2, Consonants=3

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels=" + vowels + ", Consonants=" + consonants);
    }
}