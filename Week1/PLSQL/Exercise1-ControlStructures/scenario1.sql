DO $$
DECLARE
    customer_record RECORD;
    age_years INT;
BEGIN

    FOR customer_record IN
        SELECT CustomerID, DOB
        FROM Customers
    LOOP

        age_years := DATE_PART('year', AGE(customer_record.DOB));

        IF age_years > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    RAISE NOTICE 'Interest rates updated successfully.';

END $$;