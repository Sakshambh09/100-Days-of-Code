// Define an enum Role with ADMIN, USER, GUEST.
// Use a struct Account to store the role.
// Read the role value from user input (0, 1, or 2)
// and print an appropriate message.
//
// Show Sample Test Cases
// Input 1:
// 0
// Output 1:
// Admin access granted
//
// Explanation 1:
// The enum maps numeric input to user roles stored in a struct.


#include <stdio.h>
enum Role {
    ADMIN,
    USER,
    GUEST
};
struct Account {
    enum Role role;
};
int main(void) {
    struct Account acc;
    int input;
    scanf("%d", &input);
    acc.role = (enum Role)input;
    switch (acc.role) {
        case ADMIN:
            printf("Admin access granted\n");
            break;
        case USER:
            printf("User access granted\n");
            break;
        case GUEST:
            printf("Guest access granted\n");
            break;
        default:
            printf("Invalid role\n");
    }
    return 0;
}