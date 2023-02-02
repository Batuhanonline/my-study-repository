SELECT * FROM book
WHERE page_number > 200;

SELECT page_number FROM book
WHERE title = 'Funny Girl';


SELECT * FROM book
WHERE page_number >(
	SELECT page_number FROM book
	WHERE title = 'Funny Girl'
);


SELECT title, page_number, (SELECT MAX(page_number) FROM book), (SELECT MAX(page_number) FROM book) - page_number AS differ 
FROM book
WHERE page_number > (
	SELECT page_number FROM book
	WHERE title = 'Funny Girl'
);

--Any ve All Operatörleri
SELECT first_name, last_name FROM author
WHERE id = ANY(
	SELECT id FROM book 
	WHERE title = 'Funny Girl' OR title = 'Escape to Athena'
);

SELECT first_name, last_name FROM author
WHERE id > ALL(
	SELECT id FROM book 
	WHERE title = 'Funny Girl' OR title = 'Escape to Athena'
);


