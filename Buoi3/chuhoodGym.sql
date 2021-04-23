CREATE DATABASE ChuhhodGym;
USE ChuhoodGym;


CREATE TABLE Customer(
	ID_Customer VARCHAR(10) NOT NULL PRIMARY KEY,
	Name_Customer VARCHAR(50) NOT NULL,
	Sex VARCHAR(10),
	DOB DATE,
	PhoneNumber_Customer VARCHAR(15) NOT NULL,
);

CREATE TABLE Gym_service_packages(
	ID_Pack VARCHAR(10) NOT NULL PRIMARY KEY,
	Title_Pack VARCHAR(50) NOT NULL,
	Cost INT,
	Time_Pack VARCHAR(10)
);

CREATE TABLE Gym_Contract(
	ID_Contract VARCHAR(10) NOT NULL PRIMARY KEY,
	Date_Enroll Date,
	Date_End Date,
	ID_Customer VARCHAR(10) NOT NULL REFERENCES Customer(ID_Customer),
	ID_Pack VARCHAR(10) NOT NULL REFERENCES Gym_service_packages(ID_Pack)
);

CREATE TABLE Weekdays(
	ID_Weekdays VARCHAR(10) NOT NULL,
	ID_Customer VARCHAR(10) NOT NULL REFERENCES Customer(ID_Customer),
	ID_Contract VARCHAR(10) NOT NULL REFERENCES Gym_Contract(ID_Contract)
);


---------------------------------------Customer-----------------------------------------
SELECT * FROM Customer

INSERT INTO Customer VALUES('KH001','Tran Nhan Nghia','Male','Jan 24, 2000','0939635755');
INSERT INTO Customer VALUES('KH002','Nguyen Le Thanh Cao','Male','May 5, 2000','0523294259');
INSERT INTO Customer VALUES('KH003','To Huynh Minh Khoi','Male','Jul 17, 2000','0945595503');

---------------------------------------Gym Service packages-----------------------------------------
SELECT * FROM Gym_service_packages;

INSERT INTO Gym_service_packages VALUES('GSP1','Goi ngay',30000,'1 ngay');
INSERT INTO Gym_service_packages VALUES('GSP2','Goi 1 thang',270000,'1 thang');
INSERT INTO Gym_service_packages VALUES('GSP3','Goi 2 thang',400000,'2 thang');
INSERT INTO Gym_service_packages VALUES('GSP4','Goi 6 thang',1000000,'6 thang');
INSERT INTO Gym_service_packages VALUES('GSP5','Goi 12 thang',1800000,'12 thang');
INSERT INTO Gym_service_packages VALUES('GSP6','Goi PT',5000000,'1 thang');

---------------------------------------Gym Contract-----------------------------------------
SELECT * FROM Gym_Contract;
INSERT INTO Gym_Contract VALUES('HD001','2021-04-12','2021-05-12','KH001','GSP2');
INSERT INTO Gym_Contract VALUES('HD002','2021-04-10','2021-06-12','KH002','GSP3');
INSERT INTO Gym_Contract VALUES('HD003','2021-04-20','2021-04-20','KH003','GSP1');


------------------------------------WEEKDAYS-----------------------------
SELECT * FROM Weekdays;

INSERT INTO Weekdays VALUES('Thu 2','KH002','HD002');
INSERT INTO Weekdays VALUES('Thu 2','KH001','HD001');
INSERT INTO Weekdays VALUES('Thu 3','KH003','HD003');
INSERT INTO Weekdays VALUES('Thu 4','KH001','HD001');
INSERT INTO Weekdays VALUES('Thu 4','KH001','HD001');
INSERT INTO Weekdays VALUES('Thu 5','KH001','HD001');
INSERT INTO Weekdays VALUES('Thu 5','KH002','HD002');
INSERT INTO Weekdays VALUES('Thu 5','KH003','HD003');
INSERT INTO Weekdays VALUES('Thu 6','KH002','HD002');
INSERT INTO Weekdays VALUES('Thu 6','KH001','HD001');
INSERT INTO Weekdays VALUES('Thu 7','KH003','HD003');
INSERT INTO Weekdays VALUES('Thu 7','KH002','HD002');


--/////////////////////////////////////////////////////////////////////////

--In thong tin khach hang tap vao thu 2
SELECT C.Name_Customer
FROM Weekdays W JOIN Customer C ON W.ID_Customer=C.ID_Customer
WHERE ID_Weekdays='Thu 2';


--In thong tin khach dang ky goi dich vu
SELECT C.Name_Customer
FROM Gym_Contract Co JOIN Customer C ON Co.ID_Customer=C.ID_Customer
					JOIN Gym_service_packages P ON Co.ID_Pack=P.ID_Pack
WHERE P.Title_Pack='Goi 2 thang';
