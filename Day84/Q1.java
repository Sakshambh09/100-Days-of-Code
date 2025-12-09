// Define an enum with SUCCESS, FAILURE, and TIMEOUT, and print messages accordingly.
// Show Sample Test Cases
// Input 1:
// FAILURE
// Output 1:
// Operation failed
// Explanation 1:
// FAILURE corresponds to a failed operation message.

import java.util.*;

enum Status {
    SUCCESS, FAILURE, TIMEOUT
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Status st = Status.valueOf(sc.next());
        switch (st) {
            case SUCCESS:
                System.out.println("Operation successful");
                break;
            case FAILURE:
                System.out.println("Operation failed");
                break;
            case TIMEOUT:
                System.out.println("Operation timed out");
                break;
        }
    }
}