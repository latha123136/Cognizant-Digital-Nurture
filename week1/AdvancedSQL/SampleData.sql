-- ============================
-- Customers
-- ============================

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP, LastModified)
VALUES (1, 'John Doe', TO_DATE('1985-05-15','YYYY-MM-DD'), 1000, 'N', SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP, LastModified)
VALUES (2, 'Jane Smith', TO_DATE('1990-07-20','YYYY-MM-DD'), 15000, 'N', SYSDATE);

-- Customer above 60 years old
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP, LastModified)
VALUES (3, 'Robert Wilson', TO_DATE('1955-08-10','YYYY-MM-DD'), 25000, 'N', SYSDATE);



-- ============================
-- Accounts
-- ============================

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1,1,'Savings',1000,SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2,2,'Checking',15000,SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (3,3,'Savings',25000,SYSDATE);



-- ============================
-- Transactions
-- ============================

INSERT INTO Transactions
VALUES (1,1,SYSDATE,200,'Deposit');

INSERT INTO Transactions
VALUES (2,2,SYSDATE,300,'Withdrawal');

INSERT INTO Transactions
VALUES (3,3,SYSDATE,500,'Deposit');



-- ============================
-- Loans
-- ============================

-- Loan due within next 30 days
INSERT INTO Loans
VALUES (1,1,5000,5,SYSDATE,SYSDATE+20);

-- Loan due after 60 days
INSERT INTO Loans
VALUES (2,2,8000,6,SYSDATE,SYSDATE+60);

-- Loan for senior customer
INSERT INTO Loans
VALUES (3,3,10000,7,SYSDATE,SYSDATE+15);



-- ============================
-- Employees
-- ============================

INSERT INTO Employees
VALUES (1,'Alice Johnson','Manager',70000,'HR',
TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees
VALUES (2,'Bob Brown','Developer',60000,'IT',
TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;