# Exercise 1 Analysis

## 1. What are Control Structures?

Control structures determine the flow of execution of a PL/SQL program. They allow programs to make decisions, repeat operations, and process collections of records efficiently.

The main control structures are:

* Conditional Statements (`IF`, `ELSIF`, `ELSE`)
* Loops (`LOOP`, `WHILE`, `FOR`)
* Cursors (used to process multiple rows)

---

## 2. Scenario 1 – Loan Interest Discount

The program loops through every customer. If the customer's age is greater than 60 years, the loan interest rate is reduced by 1%.

Control Structures Used:

* Cursor FOR Loop
* IF Statement

---

## 3. Scenario 2 – VIP Promotion

The program checks every customer's account balance. Customers with balances greater than $10,000 are marked as VIP by updating the `IsVIP` column.

Control Structures Used:

* Cursor FOR Loop
* IF Statement

---

## 4. Scenario 3 – Loan Reminder

The program retrieves all loans due within the next 30 days and prints reminder messages using `DBMS_OUTPUT.PUT_LINE`.

Control Structures Used:

* Cursor FOR Loop
* Date Comparison

---

## 5. Advantages of Using PL/SQL Control Structures

* Automates repetitive database operations.
* Improves readability and maintainability.
* Reduces manual effort.
* Enables efficient row-by-row processing.

---

## 6. Conclusion

PL/SQL control structures provide an efficient way to process database records. Using loops, conditions, and cursors allows banking operations such as updating customer information and generating reminders to be automated reliably.
