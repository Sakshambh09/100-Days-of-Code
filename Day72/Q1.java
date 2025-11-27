// Write a C program that creates a text file named info.txt in write mode. The program should take the user’s name and age as input, and write them to the file using fprintf(). After writing, display a message confirming that the data was successfully saved.
// Show Sample Test Cases
// Input 1:
// Name: Rahul, Age: 23
// Output 1:
// File created successfully! Data written to info.txt
// Explanation 1:
// Expected File Content (info.txt): Name: Rahul Age: 23

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void writeToFile(String name, int age) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("info.txt"));
            pw.printf("Name: %s Age: %d", name, age);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        writeToFile(name, age);
        System.out.println("File created successfully! Data written to info.txt");
    }
}
