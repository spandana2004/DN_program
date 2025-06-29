BEGIN
  FOR cust_rec IN (SELECT CustomerID, Age, InterestRate 
                   FROM Customers 
                   WHERE Age > 60) 
  LOOP
    UPDATE Customers
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = cust_rec.CustomerID;
  END LOOP;
  
  COMMIT;
END;
