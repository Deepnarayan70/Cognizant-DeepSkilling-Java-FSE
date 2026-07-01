CREATE OR REPLACE PROCEDURE AddNewCustomer(
    id INT,
    cname VARCHAR,
    dob DATE,
    bal NUMERIC
)
LANGUAGE plpgsql
AS $$
BEGIN

    INSERT INTO Customers
    VALUES(id,cname,dob,bal,CURRENT_DATE,FALSE);

    RAISE NOTICE 'Customer Added';

EXCEPTION
    WHEN unique_violation THEN
        RAISE NOTICE 'Customer ID Already Exists';

END;
$$;