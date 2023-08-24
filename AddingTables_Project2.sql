USE SoniakB_MichaelD;

CREATE TABLE Employee (
	EmployeeID SMALLINT UNSIGNED,
	Name varchar(60),
	Salary decimal,
	Bank_Acc_Number char(8),
	NI_Number char(9),
	Commission_Rate decimal,
	Department SMALLINT UNSIGNED,
	PRIMARY KEY (EmployeeID)
);

ALTER TABLE Employee MODIFY EmployeeID int AUTO_INCREMENT;

CREATE TABLE Department (
	DepartmentID SMALLINT UNSIGNED,
	DepartmentName varchar(20),
	PRIMARY KEY (DepartmentID)
);

ALTER TABLE Department MODIFY DepartmentID int AUTO_INCREMENT;

CREATE TABLE Client (
	ClientID SMALLINT UNSIGNED,
	Name varchar(60),
	Address varchar(100),
	Phone_Number char(11),
	PRIMARY KEY (ClientID)
);

ALTER TABLE Client MODIFY ClientID int AUTO_INCREMENT;

CREATE TABLE Project (
	Project_ID SMALLINT UNSIGNED,
	Client_ID SMALLINT UNSIGNED,
	Project_Name varchar(30),
	Cost decimal,
	Tech_Lead SMALLINT UNSIGNED,
	PRIMARY KEY (Project_ID)
);
ALTER TABLE Project MODIFY Project_ID int AUTO_INCREMENT;

ALTER TABLE Project
RENAME COLUMN Client_ID TO ClientID;
ALTER TABLE Project
RENAME COLUMN Project_ID TO ProjectID;

SELECT Project.ClientID, Client.Name
FROM Project
INNER JOIN Client ON Project.ClientID = Client.ClientID;

CREATE TABLE Employee_Project (
	Employee_ID SMALLINT UNSIGNED,
	Project_ID SMALLINT UNSIGNED
);
