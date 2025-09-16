// Write a program to input two numbers and display their sum.
// Show Sample Test Cases
// Input 1:
// 3 4
// Output 1:
// Sum = 7
// Input 2:
// -1 20
// Output 2:
// Sum = 19

import java.util.*;
class Q1a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = (a+b);
        System.out.println("Sum = "+ sum);
    }

}