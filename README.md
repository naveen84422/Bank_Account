# Bank_Account

# Bank Account Management System (Java)

## 📌 Overview
This is a **menu-driven Java application** that simulates a simple bank account system.  
It allows users to **deposit**, **withdraw**, **check balance**, and **view transaction history** — all through an interactive console interface.

---

## 🚀 Features
- Create a bank account with:
  - Account Number
  - Account Holder Name
  - Initial Balance
- Deposit money (positive values only)
- Withdraw money (valid amount & sufficient funds required)
- View current account balance
- View transaction history with **timestamps**
- Input validation for deposits and withdrawals

---

## 📂 Project Structure
```
BankApp.java      # Main program (menu-driven)
Account.java      # Account class with deposit/withdraw/history
README.md         # Documentation file
```

---

## 🛠 Technologies Used
- **Java** (Core concepts: Classes, Objects, Methods)
- **ArrayList** (to store transaction history)
- **java.time.LocalDateTime** (for timestamps)
- **Scanner** (for user input)

---

## 📋 How to Run
1. Save the file as `BankApp.java` (Account class is included inside or can be in a separate file).
2. Open a terminal in the project directory.
3. Compile the program:
   ```bash
   javac BankApp.java
   ```
4. Run the program:
   ```bash
   java BankApp
   ```

---

## 🖥 Sample Output
```
Enter Account Number: 123456
Enter Holder Name: John Doe
Enter Initial Balance: 1000

--- Bank Menu ---
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter your choice: 1
Enter deposit amount: 500
Deposited: 500

--- Bank Menu ---
...
```

---

## 📌 Example Transaction History
```
2025-08-11 15:30:12 - Account created with balance: 1000.0
2025-08-11 15:31:00 - Deposit: 500.0 | Balance: 1500.0
2025-08-11 15:32:10 - Withdraw: 200.0 | Balance: 1300.0
```

---

## ✨ Future Improvements
- Save transaction history to a text file
- Load previous account data when restarting the app
- Add support for multiple accounts
- Implement account login with PIN/password

---

## 👨‍💻 Author
Developed by **Naveen Kumar**
