USE SoniakB_MichaelD;

INSERT INTO Department (DepartmentName)
VALUES ("Sales");
INSERT INTO Department (DepartmentName)
VALUES ("Delivery");
INSERT INTO Department (DepartmentName)
VALUES ("HR");
INSERT INTO Department (DepartmentName)
VALUES ("Management");

INSERT INTO Employee (Name, Salary, Bank_Acc_Number, NI_Number)
VALUES ("Mickey Dawson", "23", "13257068", "PH667321D");
INSERT INTO Employee (Name, Salary, Bank_Acc_Number, NI_Number)
VALUES ("Orlaith McMenamin", "21", "42378109", "PH789054F");
INSERT INTO Employee (Name, Salary, Bank_Acc_Number, NI_Number)
VALUES ("Leigh McClurg", "24", "32988756", "PD563890G");
INSERT INTO Employee (Name, Salary, Bank_Acc_Number, NI_Number)
VALUES ("Glenn Hamilton", "31", "54738291", "PN674356D");

INSERT INTO Client (Name, Address, Phone_Number)
Values ("Shaun Ganley", "123 Kainos Avenue", "07684539843");
INSERT INTO Client (Name, Address, Phone_Number)
Values ("Shaun Dandy", "456 Belfast Street", "08964326785");
INSERT INTO Client (Name, Address, Phone_Number)
Values ("Gaun Shanley", "34 GitHub Blvd", "07845342198");
INSERT INTO Client (Name, Address, Phone_Number)
Values ("Shelly Gaun", "15 Hope Street", "07563219876");

INSERT INTO Project (Project_Name, ClientID, Cost, Tech_Lead)
VALUES ("Connecting to Github", "1", "50", "1");
INSERT INTO Project (Project_Name, ClientID, Cost, Tech_Lead)
VALUES ("Creating a Database", "2", "500", "2");
INSERT INTO Project (Project_Name, ClientID, Cost, Tech_Lead)
VALUES ("Changing the Batteries", "3", "690", "3");
INSERT INTO Project (Project_Name, ClientID, Cost, Tech_Lead)
VALUES ("Fixing my Broken Life", "4", "55000", "4");

SELECT * From Department;
SELECT * FROM Employee;
SELECT * FROM Client;
SELECT * FROM Project;

DROP TABLE Employee_Project;
DROP TABLE Project;