// Assign explicit values starting from 10 and print them.
// Show Sample Test Cases
// Input 1:
// No input
// Output 1:
// A=10
// B=11
// C=12
// Explanation 1:
// Enum values can be explicitly assigned; subsequent values auto-increment.

enum Letters {
    A(10), B(11), C(12);
    private int val;
    Letters(int v) {
        val = v;
    }
    public int getVal() {
        return val;
    }
}
public class Q1{
    public static void main(String[] args) {
        for (Letters l : Letters.values()) {
            System.out.println(l + "=" + l.getVal());
        }
    }
}