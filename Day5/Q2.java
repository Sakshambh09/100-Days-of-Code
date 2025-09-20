// Write a program to input time in seconds and convert it to
// hours:minutes:seconds format.
// Show Sample Test Cases
// Input 1:
// 3661
// Output 1:
// 1:1:1
// Input 2:
// 7322
// Output 2:
// 2:2:2

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int s = (sec % 3600) % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}