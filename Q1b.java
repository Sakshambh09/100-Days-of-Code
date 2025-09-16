// Write a program to input two numbers and display their sum, difference, product, and quotient.
// Show Sample Test Cases
// Input 1:
// 10 2
// Output 1:
// Sum=12, Diff=8, Product=20, Quotient=5
// Input 2:
// 7 3
// Output 2:
// Sum=10, Diff=4, Product=21, Quotient=2


import java.util.*;
class Q1b
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = (a+b);
        int diff = (a-b);
        int product = (a*b);
        int quotient = (a/b);
        System.out.println("Sum = "+ sum);
        System.out.println("Diff = "+ diff);
        System.out.println("Product = "+ product);
        System.out.println("Quotient = "+ quotient);
    }

}