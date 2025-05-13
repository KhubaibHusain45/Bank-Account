My code simulates a simple bank account system using object-oriented programming in Java.

Here's what it does, in simple words:

✅ 1. Class: BankAccount
This class represents a bank account with three private details:

Account Number

Account Holder's Name

Balance

It includes the following functions (methods):

🔹 deposit()
Asks the user to enter how much money they want to add to their account.

Updates the balance and shows the new balance.

🔹 withdrawal()
Asks the user how much money they want to withdraw.

If they try to withdraw more than the current balance, it shows a warning message.

If it's valid, it subtracts the amount and updates the balance.

Returns the updated balance either way.

🔹 getBalance()
Just returns the current balance without asking anything.

✅ 2. Class: MainClass
This is the class with the main() method where the program starts.

What it does:

Creates a new bank account with:

Account number: "12345"

Starting balance: 1000

Account holder: "Khubaib"

Prints the current balance.

Calls the deposit() method → user enters amount → it shows updated balance.

Calls the withdrawal() method → user enters amount → it shows updated balance
