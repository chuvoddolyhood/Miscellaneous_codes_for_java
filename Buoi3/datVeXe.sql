CREATE DATABASE TravelTicket;
USE TravelTicket;

CREATE TABlE Vexe(
	STT INT PRIMARY KEY NOT NULL,
	Hoten VARCHAR(50) NOT NULL,
	Gioitinh VARCHAR(5),
	Dotuoi VARCHAR(10),
	Diachi VARCHAR(100) NOT NULL,
	Dienthoai VARCHAR(12),
	Tuyenduong VARCHAR(50),
	Gio VARCHAR(10),
	Ngaydangky DATE,
	Ngaykhoihanh DATE
);

INSERT INTO Vexe VALUES (1,'Tran Nhan Nghia','Nam','20-30','40 duong so 3','0939635755','CanTho-SaiGon','3:45','Apr 21 2021','Apr 22 2021');
INSERT INTO Vexe VALUES (2,'Tran Nhan Nghia','Nam','20-30','40 duong so 3','0939635755','CanTho-SaiGon','3:45','Apr 21 2021','Apr 22 2021');


SELECT * FROM Vexe;

SELECT MAX(STT) AS SUM_ID FROM Vexe;
