// Change the date format from dd/04/yyyy to dd-Apr-yyyy.
// Show Sample Test Cases
// Input 1:
// 15/04/2025
// Output 1:
// 15-Apr-2025

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] parts = date.split("/");
        String month = parts[1];
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String result = parts[0] + "-" + months[Integer.parseInt(month) - 1] + "-" + parts[2];
        System.out.println(result);
    }
}
