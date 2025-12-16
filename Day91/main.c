// Define a struct with an enum Status (ACTIVE, INACTIVE).
// Store the status of a user and print a message based on it.
//
// Show Sample Test Cases
// Input 1:
// Status=ACTIVE
// Output 1:
// User is active
//
// Explanation 1:
// The enum inside the struct represents user status using named constants.


#include <stdio.h>
enum Gender {
    MALE,
    FEMALE
};
struct Person {
    enum Gender gender;
};
int main(void) {
    struct Person p;
    p.gender = MALE;
    if (p.gender == MALE)
        printf("Male\n");
    else
        printf("Female\n");
    return 0;
}