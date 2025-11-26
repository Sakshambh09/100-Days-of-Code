// Write a C program that creates a text file named info.txt in write mode. The program should take the user’s name and age as input, and write them to the file using fprintf(). After writing, display a message confirming that the data was successfully saved.
// Show Sample Test Cases
// Input 1:
// Name: Rahul, Age: 23
// Output 1:
// File created successfully! Data written to info.txt
// Explanation 1:
// Expected File Content (info.txt): Name: Rahul Age: 23

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String result = toTitleCase(input);

        System.out.println(result);
    }

    // User-defined function to convert to Title Case
    public static String toTitleCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean startOfWord = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                startOfWord = true;
                sb.append(c);
            } else if (startOfWord) {
                sb.append(Character.toUpperCase(c));
                startOfWord = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
