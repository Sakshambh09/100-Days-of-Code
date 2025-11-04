// Print the initials of a name.
// Show Sample Test Cases
// Input 1:
// John Doe
// Output 1:
// J.D.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] parts = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String p : parts) {
            if (!p.isEmpty())
                initials.append(Character.toUpperCase(p.charAt(0))).append(".");
        }
        System.out.println(initials.toString());
    }
}
