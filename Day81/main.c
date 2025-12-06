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
struct Student {
    char name[50];
    int roll;
    int marks;
};
int main()
{
    struct Student s[100];
    int n;
    printf("Enter number of students: ");
    scanf("%d", &n);
    FILE *fp = fopen("students.txt", "w");
    if (fp == NULL)
    {
        printf("Error opening file!");
        return 1;
    }
    for (int i = 0; i < n; i++)
    {
        printf("Enter name, roll, marks for student %d: ", i + 1);
        scanf("%s %d %d", s[i].name, &s[i].roll, &s[i].marks);
        fprintf(fp, "%s %d %d\n", s[i].name, s[i].roll, s[i].marks);
    }
    fclose(fp);
    fp = fopen("students.txt", "r");
    printf("\n--- Student Records ---\n");
    while (fscanf(fp, "%s %d %d", s[0].name, &s[0].roll, &s[0].marks) != EOF)
    {
        printf("Name: %s | Roll: %d | Marks: %d\n",
               s[0].name, s[0].roll, s[0].marks);
    
    fclose(fp);
    return 0;
}
}