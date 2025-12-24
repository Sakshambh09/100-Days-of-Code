// Create a simple Bank Account System.
// Use an enum TransactionType with DEPOSIT and WITHDRAW.
// Use a struct Account to store balance.
// Allow the user to perform a transaction and
// store the transaction details in a file.
//
// Show Sample Test Cases
// Input 1:
// 0 500
// Output 1:
// Balance: 1500
//
// Explanation 1:
// Enum represents transaction type, struct stores balance,
// and file handling logs the transaction.


#include <stdio.h>
enum TransactionType {
    DEPOSIT,
    WITHDRAW
};
struct Account {
    int balance;
};
int main(void) {
    struct Account acc;
    FILE *fp;
    int choice, amount;
    acc.balance = 1000;
    scanf("%d %d", &choice, &amount);
    fp = fopen("transactions.txt", "a");
    if (fp == NULL) {
        printf("File error\n");
        return 1;
    }
    if (choice == DEPOSIT)
    {
        acc.balance += amount;
        fprintf(fp, "Deposited: %d\n", amount);
    }
    else if (choice == WITHDRAW) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            fprintf(fp, "Withdrawn: %d\n", amount);
        } else {
            fprintf(fp, "Withdrawal failed: Insufficient balance\n");
        }
    } else {
        fprintf(fp, "Invalid transaction\n");
    }
    fclose(fp);
    printf("Balance: %d\n", acc.balance);
    return 0;
}