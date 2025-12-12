// Create an enum for user roles (ADMIN, USER, GUEST) and display messages based on role.
// Show Sample Test Cases
// Input 1:
// GUEST
// Output 1:
// Welcome Guest!
// Explanation 1:
// Enum value determines which message is displayed.

import java.util.*;

enum Role {
    ADMIN, USER, GUEST;
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roleStr = sc.next();
        Role role = Role.valueOf(roleStr);
        switch (role) {
            case ADMIN:
                System.out.println("Welcome Admin!");
                break;
            case USER:
                System.out.println("Welcome User!");
                break;
            case GUEST:
                System.out.println("Welcome Guest!");
                break;
        }
        sc.close();
    }
}