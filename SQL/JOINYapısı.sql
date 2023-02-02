-- JOIN Kavramı (Birleştirme)

SELECT title, first_name, last_name FROM book
INNER JOIN author ON book.author_id = author.id;

SELECT first_name, last_name, title FROM author
LEFT JOIN book ON book.author_id = author.id;

SELECT first_name, last_name, title FROM author
LEFT JOIN book ON book.author_id = author.id
WHERE book.title IS NOT NULL
ORDER BY book.title;

SELECT first_name, last_name, title FROM author
FULL JOIN book ON book.author_id = author.id;