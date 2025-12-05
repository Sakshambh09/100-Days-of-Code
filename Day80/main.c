// Store multiple student records (name, roll number, marks) into a file using fprintf(). Then read them using fscanf() and display each record.
// Show Sample Test Cases
// Input 1:
// Student 1 → Name: Asha, Roll: 101, Marks: 85; Student 2 → Name: Ravi, Roll: 102, Marks: 92
// Output 1:
// Name: Asha | Roll: 101 | Marks: 85
// Name: Ravi | Roll: 102 | Marks: 92
// Explanation 1:
// Expected File Content (students.txt): Asha 101 85\nRavi 102 92


#include <stdio.h>
void writeRecords()
{
    FILE *file = fopen("students.txt", "w");
    if (file == NULL)
    {
        printf("Error opening file for writing.\n");
        return;
    }
    int n;
    printf("Enter number of students: ");
    scanf("%d", &n);
    char name[50];
    int roll, marks;
    for (int i = 0; i < n; i++) 
    {
        printf("\nEnter details for Student %d\n", i + 1);
        printf("Name: ");
        scanf("%s", name);
        printf("Roll: ");
        scanf("%d", &roll);
        printf("Marks: ");
        scanf("%d", &marks);
        fprintf(file, "%s %d %d\n", name, roll, marks);
    }
    fclose(file);
}
void readRecords()
{
    FILE *file = fopen("students.txt", "r");
    if (file == NULL) {
        printf("Error opening file for reading.\n");
        return;
    }
    char name[50];
    int roll, marks;
    printf("\nStored Records:\n");
    while (fscanf(file, "%s %d %d", name, &roll, &marks) == 3) {
        printf("Name: %s | Roll: %d | Marks: %d\n", name, roll, marks);
    }
    fclose(file);
}
int main() {
    writeRecords();
    readRecords();
    return 0;
}