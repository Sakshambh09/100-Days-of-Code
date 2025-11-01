// Remove all vowels from a string.
// Show Sample Test Cases
// Input 1:
// education
// Output 1:
// dctn

import java.util.*;

public class Q1 {
    public static String removeVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String input1 = "education";
        System.out.println(removeVowels(input1));

        String input2 = "ProgrammingIsFun";
        System.out.println(removeVowels(input2));
    }
}