// Define an enum TrafficLight with RED, YELLOW, GREEN.
// Use a struct Signal to store the current light.
// Print the action based on the traffic light using switch.
//
// Show Sample Test Cases
// Input 1:
// TrafficLight=GREEN
// Output 1:
// Go
//
// Explanation 1:
// The enum represents traffic light states and switch controls the action.


#include <stdio.h>
enum TrafficLight {
    RED,
    YELLOW,
    GREEN
};
struct Signal {
    enum TrafficLight light;
};
int main(void) {
    struct Signal s;
    s.light = GREEN;
    switch (s.light) {
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