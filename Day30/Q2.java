// Count positive, negative, and zero elements in an array.
// Show Sample Test Cases
// Input 1:
// 5
// -1 0 1 2 -2
// Output 1:
// Positive=2, Negative=2, Zero=1

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive=" + positiveCount + ", Negative=" + negativeCount + ", Zero=" + zeroCount);
    }
}