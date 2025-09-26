// Write a program to find profit or loss percentage given cost price and selling price.
// Show Sample Test Cases
// Input 1:
// 1000 1200
// Output 1:
// Profit 20%
// Input 2:
// 1000 800
// Output 2:
// Loss 20%
// Input 3:
// 1000 1000
// Output 3:
// No Profit No Loss

import java.util.*;

class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int sp = sc.nextInt();
        if (sp > cp) {
            int profit = sp - cp;
            int profit_percent = (profit * 100) / cp;
            System.out.println("Profit " + profit_percent + "%");
        } else if (cp > sp) {
            int loss = cp - sp;
            int loss_percent = (loss * 100) / cp;
            System.out.println("Loss " + loss_percent + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}