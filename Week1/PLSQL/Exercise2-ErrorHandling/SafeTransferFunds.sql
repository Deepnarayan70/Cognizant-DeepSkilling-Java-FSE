CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    fromAccount INT,
    toAccount INT,
    amount NUMERIC
)
LANGUAGE plpgsql
AS $$
DECLARE
    balance NUMERIC;
BEGIN

    SELECT Balance
    INTO balance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF balance < amount THEN
        RAISE EXCEPTION 'Insufficient Balance';
    END IF;

    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = fromAccount;

    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = toAccount;

    RAISE NOTICE 'Transfer Successful';

EXCEPTION
    WHEN OTHERS THEN
        RAISE NOTICE 'Transfer Failed';
END;
$$;