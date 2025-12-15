// Define a struct with enum Gender and print person's gender.
// Show Sample Test Cases
// Input 1:
// Gender=MALE
// Output 1:
// Male
// Explanation 1:
// The enum inside the struct allows representing gender as a named constant.



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