// Build a simple Student Management System.
// Use enum to represent student status (ACTIVE, INACTIVE).
// Use struct to store student details.
// Allow adding a student and saving data to a file.
//
// This program demonstrates enums, structs,
// user input, and file handling in C.


#include <stdio.h>
enum Status {
    ACTIVE,
    INACTIVE
};
struct Student {
    int id;
    char name[50];
    enum Status status;
};
int main(void) {
    struct Student s;
    FILE *fp;
    int input;
    printf("Enter Student ID: ");
    scanf("%d", &s.id);
    printf("Enter Student Name: ");
    scanf("%s", s.name);
    printf("Enter Status (0 = ACTIVE, 1 = INACTIVE): ");
    scanf("%d", &input);
    s.status = (enum Status)input;
    fp = fopen("students.txt", "a");
    if (fp == NULL) {
        printf("File error\n");
        return 1;
    }
    fprintf(fp, "ID: %d, Name: %s, Status: %s\n",
            s.id,
            s.name,
            (s.status == ACTIVE) ? "ACTIVE" : "INACTIVE");
    fclose(fp);
    printf("Student record saved successfully\n");
    return 0;
}