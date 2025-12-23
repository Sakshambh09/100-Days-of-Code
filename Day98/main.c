// Define an enum LogLevel with INFO, WARNING, ERROR.
// Write the log message to a file based on the log level.
//
// Show Sample Test Cases
// Input 1:
// 2
// Output File Content:
// ERROR: System failure
//
// Explanation 1:
// Enum values represent log levels and are written to a file.


#include <stdio.h>
enum LogLevel
{
    INFO,
    WARNING,
    ERROR
};
int main(void)
{
    FILE *fp;
    int input;
    scanf("%d", &input);
    fp = fopen("log.txt", "w");
    if (fp == NULL) {
        printf("File error\n");
        return 1;
    }
    switch ((enum LogLevel)input)
    {
        case INFO:
            fprintf(fp, "INFO: System running\n");
            printf("Log written: INFO\n");
            break;
        case WARNING:
            fprintf(fp, "WARNING: Low memory\n");
            printf("Log written: WARNING\n");
            break;
        case ERROR:
            fprintf(fp, "ERROR: System failure\n");
            printf("Log written: ERROR\n");
            break;
        default:
            fprintf(fp, "Invalid log level\n");
            printf("Invalid input\n");
    }
    fclose(fp);
    return 0;
}