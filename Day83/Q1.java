// Create an enum for months and print how many days each month has.
// Show Sample Test Cases
// Input 1:
// FEB
// Output 1:
// 28 or 29 days
// Explanation 1:
// February has 28 days in a normal year and 29 in a leap year.

import java.util.*;

enum Month {
    JAN(31), FEB(28), MAR(31), APR(30),
    MAY(31), JUN(30), JUL(31), AUG(31),
    SEP(30), OCT(31), NOV(30), DEC(31);

    private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        Month month = Month.valueOf(m);

        if (month == Month.FEB)
            System.out.println("28 or 29 days");
        else
            System.out.println(month.getDays() + " days");
    }
}