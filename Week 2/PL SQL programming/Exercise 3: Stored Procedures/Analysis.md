# Exercise 3 Analysis

## 1. What is a Stored Procedure?

A stored procedure is a named PL/SQL program unit stored in the Oracle database. It contains SQL statements and procedural logic that can be executed whenever required.

### Advantages

* Code reusability
* Improved performance
* Better security
* Easier maintenance
* Reduced network traffic

---

## 2. Scenario 1 – Process Monthly Interest

The procedure updates the balance of every savings account by applying a 1% monthly interest.

Formula:

New Balance = Current Balance + (Current Balance × 1%)

Control Structures Used

* UPDATE statement
* Arithmetic operations

---

## 3. Scenario 2 – Update Employee Bonus

The procedure accepts two parameters:

* Department ID
* Bonus Percentage

It increases the salary of all employees in the specified department according to the supplied bonus percentage.

---

## 4. Scenario 3 – Transfer Funds

The procedure performs a secure transfer by:

1. Checking the balance of the source account.
2. Verifying that sufficient funds are available.
3. Deducting the amount from the sender.
4. Crediting the amount to the receiver.
5. Committing the transaction.
6. Rolling back if an error occurs.

---

## 5. Benefits of Stored Procedures

* Centralized business logic
* Faster execution since procedures are precompiled
* Improved consistency across applications
* Simplified application development

---

## 6. Conclusion

Stored procedures are widely used in banking applications because they execute business rules directly inside the database, ensuring data consistency, security, and better performance.
