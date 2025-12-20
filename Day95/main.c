// Define an enum Priority with explicit values LOW=1, MEDIUM=2, HIGH=3.
// Use a struct Task to store the task priority.
// Print a message based on the priority.
//
// Show Sample Test Cases
// Input 1:
// Priority=3
// Output 1:
// High priority task
//
// Explanation 1:
// Enum values are explicitly assigned and used inside a struct.


#include <stdio.h>
enum Priority {
    LOW = 1,
    MEDIUM = 2,
    HIGH = 3
};
struct Task {
    enum Priority priority;
};
int main(void) {
    struct Task t;
    int input;
    scanf("%d", &input);
    t.priority = (enum Priority)input;
    if (t.priority == LOW)
        printf("Low priority task\n");
    else if (t.priority == MEDIUM)
        printf("Medium priority task\n");
    else if (t.priority == HIGH)
        printf("High priority task\n");
    else
        printf("Invalid priority\n");
    return 0;
}