// Define an enum for traffic lights (RED, YELLOW, GREEN) and print 'Stop', 'Wait', or 'Go' based on its value.
// Show Sample Test Cases
// Input 1:
// GREEN
// Output 1:
// Go
// Explanation 1:
// When the enum value is GREEN, the program prints 'Go'.



#include <stdio.h>
#include <string.h>
enum TrafficLight
{
    RED,
    YELLOW,
    GREEN
};
int main()
{
    char input[20];
    enum TrafficLight signal;

    printf("Enter traffic light (RED / YELLOW / GREEN): ");
    scanf("%s", input);
    if (strcmp(input, "RED") == 0)
        signal = RED;
    else if (strcmp(input, "YELLOW") == 0)
        signal = YELLOW;
    else if (strcmp(input, "GREEN") == 0)
        signal = GREEN;
    else
    {
        printf("Invalid Input\n");
        return 0;
    }
    switch (signal)
    {
        case RED:
            printf("Stop\n");
            break;
        case YELLOW:
            printf("Wait\n");
            break;
        case GREEN:
            printf("Go\n");
            break;
    }
    return 0;
}