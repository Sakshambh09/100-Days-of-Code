// Write a program to implement a basic calculator using switch-case for +, -, *, /, %.
// Show Sample Test Cases
// Input 1:
// 4 2 +
// Output 1:
// 6
// Input 2:
// 10 3 %
// Output 2:
// 1
// Input 3:
// 15 5 /
// Output 3:
// 3

import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}