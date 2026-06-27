DO $$
DECLARE
    loan_record RECORD;
BEGIN

    FOR loan_record IN
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate <= CURRENT_DATE + 30
    LOOP

        RAISE NOTICE
        'Reminder: Customer % has Loan % due on %',
        loan_record.CustomerID,
        loan_record.LoanID,
        loan_record.EndDate;

    END LOOP;

END $$;