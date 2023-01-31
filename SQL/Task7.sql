/*
film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
*/
Select rating, Count(*) From film
Group By rating;

/*
film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film 
sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
*/
Select replacement_cost, Count(*) From film
Group By replacement_cost
Having Count(*) > 50;