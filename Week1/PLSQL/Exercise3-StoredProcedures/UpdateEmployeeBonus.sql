CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept VARCHAR,
    bonus NUMERIC
)
LANGUAGE plpgsql
AS $$
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * bonus / 100)
    WHERE Department = dept;

    RAISE NOTICE 'Bonus updated successfully.';

END;
$$;
