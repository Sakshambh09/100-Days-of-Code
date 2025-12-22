// Define an enum Day with MON, TUE, WED, THU, FRI, SAT, SUN.
// Use an array to store the names of the days.
// Print the day name based on user input (0–6).
//
// Show Sample Test Cases
// Input 1:
// 5
// Output 1:
// Saturday
//
// Explanation 1:
// Enum values act as indices to access the day names array.


#include <stdio.h>
enum Day {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
};
int main(void) {
    int input;
    const char *days[] = {
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    };
    scanf("%d", &input);
    if (input >= MON && input <= SUN)
        printf("%s\n", days[input]);
    else
        printf("Invalid day\n");
    return 0;
}