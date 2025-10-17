// Search for an element in an array using linear search.
// Show Sample Test Cases
// Input 1:
// 5
// 1 2 3 4 5
// 3
// Output 1:
// Found at index 2
// Input 2:
// 4
// 10 20 30 40
// 25
// Output 2:
// -1

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}