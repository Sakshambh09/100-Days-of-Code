// Define an enum Level with values LOW, MEDIUM, HIGH.
// Use a struct Alert that stores the alert level.
// Print a message based on the alert level.
//
// Show Sample Test Cases
// Input 1:
// Level=HIGH
// Output 1:
// High alert
//
// Explanation 1:
// The enum allows alert levels to be represented using named constants.


#include <stdio.h>

enum Level {
    LOW,
    MEDIUM,
    HIGH
};
struct Alert {
    enum Level level;
};
int main(void) {
    struct Alert a;

    a.level = HIGH;

    if (a.level == LOW)
        printf("Low alert\n");
    else if (a.level == MEDIUM)
        printf("Medium alert\n");
    else
        printf("High alert\n");

    return 0;
}