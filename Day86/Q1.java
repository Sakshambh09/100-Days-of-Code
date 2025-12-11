// Use enum to represent menu choices (ADD, SUBTRACT, MULTIPLY) and perform operations using switch.
// Show Sample Test Cases
// Input 1:
// ADD 10 20
// Output 1:
// 30
// Explanation 1:
// The enum ADD triggers addition of 10 and 20.

import java.util.*;

enum Operation {
    ADD, SUBTRACT, MULTIPLY;
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input: e.g. ADD 10 20
        String opStr = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Operation op = Operation.valueOf(opStr);
        switch (op) {
            case ADD:
                System.out.println(a + b);
                break;
            case SUBTRACT:
                System.out.println(a - b);
                break;
            case MULTIPLY:
                System.out.println(a * b);
                break;
        }
        sc.close();
    }
}