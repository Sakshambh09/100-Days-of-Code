// Create a menu-driven program using enum Operations
// with ADD, SUBTRACT, MULTIPLY.
// Read two integers and an operation choice from the user
// and perform the selected operation using switch.
//
// Show Sample Test Cases
// Input 1:
// 0 10 5
// Output 1:
// 15
//
// Explanation 1:
// Enum values represent operations and switch executes logic.


#include <stdio.h>
enum Operations {
    ADD,
    SUBTRACT,
    MULTIPLY
};
int main(void) {
    int a, b;
    enum Operations op;
    int choice;
    scanf("%d %d %d", &choice, &a, &b);
    op = (enum Operations)choice;
    switch (op) {
        case ADD:
            printf("%d\n", a + b);
            break;
        case SUBTRACT:
            printf("%d\n", a - b);
            break;
        case MULTIPLY:
            printf("%d\n", a * b);
            break;
        default:
            printf("Invalid operation\n");
    }
    return 0;
}