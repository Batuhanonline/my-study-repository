
-- Tablo Oluşturmak ve Silmek (CREATE - DROP) -----------------------------------------------------
CREATE TABLE AUTHOR (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(100),
	birthday DATE
);

Select * From author;

INSERT INTO author(first_name, last_name, email, birthday)
VALUES 
	('Haruki', 'Murakami', 'haruki@murakami.com', '1948-11-07'),
	('Sabahattin', 'Ali', 'sabahattin@ali.com', '1914-01-07')	,
	('Orhan', 'Pamuk', 'orhan@pamuk.com', '1950-11-07')	,
	('Halide Edip', 'Adıvar', 'halide@edip.com', '1948-11-09')	,
	('Zygmunt', 'Bauman', 'zygmunt@bauman.com', '1911-11-07');	
	
	
	
CREATE TABLE author2 (LIKE author);

Select * From author2;

INSERT INTO author2
SELECT * FROM author
WHERE first_name = 'Sabahattin';

DROP TABLE IF EXISTS author2;

--Tablo Verilerini Güncellemek (UPDATE - DELETE)---------------------------------------------

UPDATE author
SET first_name = 'Emrah Safa',
	last_name = 'Gürkan',
	email = 'emrah@gürkan.com',
	birthday = '1990-01-01'
WHERE id = 10;


Select * From author;


DELETE FROM author
WHERE id = 6;