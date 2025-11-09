// Write a Program to take a positive integer n as input, and find the pivot integer x such that the sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively. Print the pivot integer x. If no such integer exists, print -1. Assume that it is guaranteed that there will be at most one pivot integer for the given input.
// Show Sample Test Cases
// Input 1:
// n = 8
// Output 1:
// 6
// Explanation 1:
// 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
// Input 2:
// n = 1
// Output 2:
// 1
// Explanation 2:
// 1 is the pivot integer since: 1 = 1.
// Input 3:
// n = 4
// Output 3:
// -1
// Explanation 3:
// It can be proved that no such integer exists.
// Follow-up 1 (optional): Can you do it in O(log n) Time Complexity? Follow-up 2 (optional): Can you do it in O(1) Time Complexity?

import java.util.*;

public class Q1 {

    // Function to find pivot integer x
    public static int findPivot(int n) {
        // Total sum of 1 to n = n*(n+1)/2
        int totalSum = n * (n + 1) / 2;

        // We need to find x such that:
        // sum(1 to x) == sum(x to n)
        // => x*(x + 1)/2 = totalSum - (x*(x - 1)/2)
        // => x^2 = totalSum
        // So x = sqrt(totalSum)

        int x = (int) Math.sqrt(totalSum);
        if (x * x == totalSum) {
            return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = findPivot(n);
        System.out.println("Output: " + result);

        sc.close();
    }
}
