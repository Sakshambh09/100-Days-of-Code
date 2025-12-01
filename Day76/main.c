// Ask the user for a filename. Check if it exists by trying to open it in read mode. If the file pointer is NULL, print an error message; otherwise, read and display its content.
// Show Sample Test Cases
// Input 1:
// Filename: sample.txt (File Exists: Yes)
// Output 1:
// File opened successfully.
// (Displays file content)
// Explanation 1:
// The program opens the existing file and prints its content using fgets().
// Input 2:
// Filename: nofile.txt (File Exists: No)
// Output 2:
// Error: File does not exist!
// Explanation 2:
// Since fopen() returns NULL, an error message is displayed instead of reading.


#include <stdio.h>
void checkFile(char filename[])
{
    char buffer[500];
    FILE *fp = fopen(filename, "r");
    if (fp == NULL)
    {
        printf("Error: File does not exist!\n");
        return;
    }
    printf("File opened successfully.\n");
    while (fgets(buffer, sizeof(buffer), fp) != NULL)
    {
        printf("%s", buffer);
    }
    fclose(fp);
}
int main()
{
    char filename[100];
    printf("Enter filename: ");
    scanf("%s", filename);

    checkFile(filename);

    return 0;
}