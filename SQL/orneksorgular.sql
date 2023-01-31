Select title, rental_rate, length From film
Where title Like 'A%'
Order By rental_rate, length DESC;

Select * From film
Where rating = 'G'
Order By length DESC;

--Aggregate Fonksiyonlar - MIN, MAX, SUM, AVG

Select Max(replacement_cost) From film;

Select Min(rental_rate) From film;

Select Avg(length) From film;

Select Round(Avg(length), 3) From film;

Select Sum(rental_rate) From film;


-- GROUP BY

Select rental_rate, Count(*) From film
Group By rental_rate;


Select rating, Count(*) From film
Group By rating;

Select replacement_cost, Min(length) From film
Group By replacement_cost
Order By replacement_cost;

Select replacement_cost, rental_rate, Min(length) From film
Group By replacement_cost, rental_rate
Order By replacement_cost, rental_rate;

--HAVING

Select rental_rate, Count(*) From film
Group By rental_rate
Having Count(*) > 325;


Select staff_id, Count(*) From payment
Group By staff_id
Having Count(*) > 7300;

Select customer_id, Sum(amount) From payment
Group By customer_id
Having Sum(amount) > 100
Order By Sum(amount) DESC;

--ALIAS (AS)

Select first_name as isim, last_name as soyisim From actor;

Select first_name as "isim test", last_name as "soyisim test" From actor;

Select Count(*) as "aktör sayısı" From actor;

Select Concat(first_name, ' ', last_name) as "İsim ve Soyisim" From actor;
