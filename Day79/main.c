// A file numbers.txt contains a list of integers separated by spaces. Read all integers, compute their sum and average, and print both.
// Show Sample Test Cases
// Input 1:
// File: numbers.txt (Content: 10 20 30 40 50)
// Output 1:
// Sum = 150
// Average = 30.00
// Explanation 1:
// The program reads integers from the file, computes their total sum (150), and calculates the average (30.00).


#include <stdio.h>
int computeSum(int arr[], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];
    return sum;
}
float computeAverage(int sum, int n)
{
    if (n == 0) return 0;
    return (float)sum / n;
}
int main()
{
    FILE *file;
    int num;
    int arr[1000];
    int count = 0;
    file = fopen("numbers.txt", "r");
    if (file == NULL)
    {
        printf("Error opening file.\n");
        return 1;
    }
    while (fscanf(file, "%d", &num) == 1) {
        arr[count++] = num;
    }
    fclose(file);
    int sum = computeSum(arr, count);
    float avg = computeAverage(sum, count);
    printf("Sum = %d\n", sum);
    printf("Average = %.2f\n", avg);
    return 0;
}
