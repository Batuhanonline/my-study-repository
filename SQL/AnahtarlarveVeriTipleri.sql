CREATE TABLE book(
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	aouthor_id INTEGER REFERENCES author(id)
);

SELECT * FROM book;


insert into book (title, page_number, aouthor_id) values ('Funny Girl', 349, 13);
insert into book (title, page_number, aouthor_id) values ('Last Waltz, The', 207, 45);
insert into book (title, page_number, aouthor_id) values ('Mustasukkaisuus', 146, 65);
insert into book (title, page_number, aouthor_id) values ('Good News', 423, 13);
insert into book (title, page_number, aouthor_id) values ('Changing Sides (De l''autre côté du lit)', 80, 45);
insert into book (title, page_number, aouthor_id) values ('Spirit of ''76, The', 220, 84);
insert into book (title, page_number, aouthor_id) values ('Skin', 87, 48);
insert into book (title, page_number, aouthor_id) values ('Apartment 1303', 370, 85);
insert into book (title, page_number, aouthor_id) values ('Escape to Athena', 188, 68);
insert into book (title, page_number, aouthor_id) values ('Landscape with a Woman (Zena s krajolikom)', 83, 42);


Select * From book
Join author On author.id = book.aouthor_id;


--ALTER ve NOT NULL

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(20),
	email VARCHAR(50),
	age INTEGER
);

SELECT * FROM users;

INSERT INTO users(username, email, age)
VALUES
	('tester2', 'tester@gmail.com', 54);


ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

DELETE FROM users
WHERE username IS NULL
RETURNING *;

-- UNIQUE


UPDATE users
SET email = 'tester2@gmail.com'
WHERE id = 4;

ALTER TABLE users
ADD UNIQUE (email);

INSERT INTO users(username, email, age)
VALUES
	('tester2', 'tester@gmail.com', 54);


-- CHECK

INSERT INTO users(username, email, age)
VALUES
	('gamer3', 'gamer3@gmail.com', -22);

SELECT * FROM users;

ALTER TABLE users
ADD CHECK (age>=18);

DELETE FROM users
WHERE age < 18
RETURNING *;