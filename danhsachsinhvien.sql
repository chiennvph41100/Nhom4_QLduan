USE Assigment;

CREATE TABLE SinhVien
(
	MaSV nvarchar(10) PRIMARY KEY,
	HoTen nvarchar(50),
	TiengAnh float,
	TinHoc float,
	GDTC float,
)

INSERT INTO SinhVien
	(MaSV, HoTen, TiengAnh, TinHoc, GDTC)
VALUES
	('SV1', N'Nguyễn Văn A', 4, 5, 6),
	('SV2', N'Nguyễn Văn B', 5, 6, 7),
	('SV3', N'Nguyễn Văn C', 6, 7, 8),
	('SV4', N'Nguyễn Văn D', 7, 8, 9),
	('SV5', N'Nguyễn Văn E', 8, 9, 10)

SELECT * FROM SinhVien