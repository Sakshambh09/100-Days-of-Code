// Write a c program that opens an existing file (e.g., info.txt) and reads its contents using fgets(). The program should print all the lines to the console until EOF (end of file) is reached.
// Show Sample Test Cases
// Input 1:
// File: info.txt (Content: Name: Rahul\nAge: 23)
// Output 1:
// Name: Rahul
// Age: 23
// Explanation 1:
// The program reads each line from info.txt using fgets() and prints it until EOF.

#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *fp = fopen("info.txt", "r");
    if (fp == NULL) {
        printf("Could not open info.txt\n");
        return 1;
    }

    char line[256];
    while (fgets(line, sizeof(line), fp) != NULL) {
        printf("%s", line);
    }

    fclose(fp);
    return 0;
}
