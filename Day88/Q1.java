// Print all enum names and integer values using a loop.
// Show Sample Test Cases
// Input 1:
// No input
// Output 1:
// RED=0
// YELLOW=1
// GREEN=2
// Explanation 1:
// Iterating through enum values prints each constant with its assigned integer.

enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class Q1 {
    public static void main(String[] args) {
        for (TrafficLight t : TrafficLight.values()) {
            System.out.println(t.name() + "=" + t.ordinal());
        }
    }
}