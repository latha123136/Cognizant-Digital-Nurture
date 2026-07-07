SET SERVEROUTPUT ON;

BEGIN
    FOR cust IN (
        SELECT CustomerID, DOB
        FROM Customers
    )
    LOOP
        IF MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12 > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: ' || cust.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/




SET SERVEROUTPUT ON;

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID ' || cust.CustomerID || ' promoted to VIP.'
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/




SET SERVEROUTPUT ON;

BEGIN
    FOR loan_rec IN (
        SELECT l.LoanID,
               c.Name,
               l.EndDate
        FROM Loans l
        JOIN Customers c
            ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || loan_rec.LoanID
            || ' for '
            || loan_rec.Name
            || ' is due on '
            || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/