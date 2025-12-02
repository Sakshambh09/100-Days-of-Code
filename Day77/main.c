// Write a program that reads text from input.txt, converts all lowercase letters to uppercase, and writes the result to output.txt.
// Show Sample Test Cases
// Input 1:
// Input File (input.txt): Hello World\nC programming
// Output 1:
// Output File (output.txt): HELLO WORLD\nC PROGRAMMING
// Explanation 1:
// All lowercase letters in input.txt are converted to uppercase using character manipulation before writing to output.txt.



#include <stdio.h>
#include <ctype.h> 
void convertToUppercase(char inFileName[], char outFileName[])
{
    FILE *inFile, *outFile;
    char ch;
    inFile = fopen(inFileName, "r");
    if (inFile == NULL) {
        printf("Error: %s does not exist!\n", inFileName);
        return;
    }
    outFile = fopen(outFileName, "w");
    if (outFile == NULL) {
        printf("Error: Could not create %s!\n", outFileName);
        fclose(inFile);
        return;
    }
    while ((ch = fgetc(inFile)) != EOF)
    {
        fputc(toupper(ch), outFile);
    }
    printf("Conversion complete! Check %s\n", outFileName);
    fclose(inFile);
    fclose(outFile);
}
int main()
{
    convertToUppercase("input.txt", "output.txt");

    return 0;
}