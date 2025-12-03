// Read a text file and count how many vowels and consonants are in the file. Ignore digits and special characters.
// Show Sample Test Cases
// Input 1:
// File: text.txt (Content: Welcome to C language)
// Output 1:
// Vowels: 8
// Consonants: 10
// Explanation 1:
// The program iterates through each character, counts vowels (A, E, I, O, U) and consonants, ignoring other symbols.




#include <stdio.h>
#include <ctype.h>

int countVowels(char ch) {
    ch = tolower(ch);
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}

int countConsonants(char ch) {
    ch = tolower(ch);
    return (ch >= 'a' && ch <= 'z' &&
            !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'));
}

int main() {
    FILE *file;
    char ch;
    int vowels = 0, consonants = 0;

    file = fopen("text.txt", "r");  // open the file

    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    while ((ch = fgetc(file)) != EOF) {
        if (countVowels(ch))
            vowels++;
        else if (countConsonants(ch))
            consonants++;
    }

    fclose(file);

    printf("Vowels: %d\n", vowels);
    printf("Consonants: %d\n", consonants);

    return 0;
}
