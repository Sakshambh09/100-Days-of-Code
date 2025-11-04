// Print initials of a name with the surname displayed in full.
// Show Sample Test Cases
// Input 1:
// John David Doe
// Output 1:
// J.D. Doe

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        String[] parts = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            if (!parts[i].isEmpty())
                result.append(Character.toUpperCase(parts[i].charAt(0))).append(".");
        }
        result.append(" ").append(parts[parts.length - 1]);
        System.out.println(result.toString());
    }
}
