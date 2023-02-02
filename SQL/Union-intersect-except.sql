--UNION
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
UNION
(
SELECT * FROM book
ORDER BY title
LIMIT 5
);

--UNION ALL
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
UNION ALL
(
SELECT * FROM book
ORDER BY title
LIMIT 5
);


(
SELECT id, email FROM author
)
UNION ALL
(
SELECT id, title FROM book
);

-- INTERSECT

(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
INTERSECT
(
SELECT * FROM book
ORDER BY title
LIMIT 5
);

--EXCEPT
(
SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5
)
EXCEPT
(
SELECT * FROM book
ORDER BY title
LIMIT 5
);