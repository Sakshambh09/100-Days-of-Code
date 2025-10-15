// Find the maximum and minimum element in an array.
// Show Sample Test Cases
// Input 1:
// 5
// 2 9 1 4 7
// Output 1:
// Max=9, Min=1
// Input 2:
// 3
// 10 10 10
// Output 2:
// Max=10, Min=10

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max=" + max + ", Min=" + min);
    }
}