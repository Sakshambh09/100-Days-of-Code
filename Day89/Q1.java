// Show that enums store integers by printing assigned values.
// Show Sample Test Cases
// Input 1:
// No input
// Output 1:
// SUCCESS=0, FAILURE=1, TIMEOUT=2
// Explanation 1:
// Enum constants are internally stored as integer values starting from 0.

enum Status {
    SUCCESS,
    FAILURE,
    TIMEOUT
}

public class Q1 {
    public static void main(String[] args) {
        for (Status s : Status.values()) {
            System.out.print(s.name() + "=" + s.ordinal());
            if (s != Status.TIMEOUT)
                System.out.print(", ");
        }
    }
}
