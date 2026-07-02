DECLARE
BEGIN

    FOR customer_record IN (

        SELECT CustomerID,
               Age,
               LoanInterestRate
        FROM Customers

    )

    LOOP

        IF customer_record.Age > 60 THEN

            UPDATE Customers
            SET LoanInterestRate = LoanInterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan interest discount applied successfully.');

END;
/
