CREATE OR REPLACE PROCEDURE UpdateSalary(
    empId INT,
    percentage NUMERIC
)
LANGUAGE plpgsql
AS $$
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * percentage / 100)
    WHERE EmployeeID = empId;

    IF NOT FOUND THEN
        RAISE NOTICE 'Employee Not Found';
    ELSE
        RAISE NOTICE 'Salary Updated';
    END IF;

END;
$$;