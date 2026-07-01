
CREATE OR REPLACE PROCEDURE TransferFunds(
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

    IF balance >= amount THEN

        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccount;

        RAISE NOTICE 'Transfer completed successfully.';

    ELSE
        RAISE NOTICE 'Insufficient balance.';
    END IF;

END;
$$;