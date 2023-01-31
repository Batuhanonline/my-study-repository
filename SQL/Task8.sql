/*
test veritabanınızda employee isimli sütun bilgileri 
id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
*/
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

/*
Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
*/
insert into employee (name, birthday, email) values ('Odille Spykins', '1994-12-28', 'ospykins0@addthis.com');
insert into employee (name, birthday, email) values ('Simeon Lief', '1991-09-25', 'slief1@artisteer.com');
insert into employee (name, birthday, email) values ('Boothe Turley', '1998-09-26', 'bturley2@cbslocal.com');
insert into employee (name, birthday, email) values ('Michele Sandhill', '1997-05-11', 'msandhill3@wired.com');
insert into employee (name, birthday, email) values ('Aubrey Langcaster', '1995-11-08', 'alangcaster4@list-manage.com');
insert into employee (name, birthday, email) values ('Isiahi Pagitt', '1996-03-09', 'ipagitt5@microsoft.com');
insert into employee (name, birthday, email) values ('Cristie Dive', '1999-08-14', 'cdive6@constantcontact.com');
insert into employee (name, birthday, email) values ('Kat Bolderson', '1990-07-17', 'kbolderson7@bbb.org');
insert into employee (name, birthday, email) values ('Patton Stilgoe', null, null);
insert into employee (name, birthday, email) values ('Klement Gouldstraw', '1996-12-04', 'kgouldstraw9@de.vu');
insert into employee (name, birthday, email) values ('Keeley Drawmer', '1998-11-12', 'kdrawmera@usatoday.com');
insert into employee (name, birthday, email) values ('Joshuah Arenson', '1991-11-19', 'jarensonb@ihg.com');
insert into employee (name, birthday, email) values ('Lucius Macro', '1990-02-19', 'lmacroc@miitbeian.gov.cn');
insert into employee (name, birthday, email) values ('Vinita Fausset', '1999-06-13', 'vfaussetd@google.pl');
insert into employee (name, birthday, email) values ('Noni Owbrick', '1990-04-30', 'nowbricke@cam.ac.uk');
insert into employee (name, birthday, email) values ('Carmelle Snell', null, null);
insert into employee (name, birthday, email) values ('Welby Ballach', '1991-03-06', 'wballachg@altervista.org');
insert into employee (name, birthday, email) values ('Sylvia Bison', '1992-02-10', 'sbisonh@icq.com');
insert into employee (name, birthday, email) values ('Carri Surman', '1995-01-03', 'csurmani@wikimedia.org');
insert into employee (name, birthday, email) values ('Suzette O''Nions', '1996-10-03', 'sonionsj@va.gov');
insert into employee (name, birthday, email) values ('Lianna Hadaway', '1991-07-28', 'lhadawayk@ifeng.com');
insert into employee (name, birthday, email) values ('Renaud Daouse', '1997-09-26', 'rdaousel@icio.us');
insert into employee (name, birthday, email) values ('Aigneis Pittet', '1991-06-18', 'apittetm@123-reg.co.uk');
insert into employee (name, birthday, email) values ('Jan Bortolomei', null, null);
insert into employee (name, birthday, email) values ('Alphard Piggford', '1998-06-18', 'apiggfordo@disqus.com');
insert into employee (name, birthday, email) values ('Harley Garwood', '1992-06-07', 'hgarwoodp@ocn.ne.jp');
insert into employee (name, birthday, email) values ('Rosalie Daviddi', '1998-12-21', 'rdaviddiq@ning.com');
insert into employee (name, birthday, email) values ('Nefen Annett', '1994-01-13', 'nannettr@wordpress.org');
insert into employee (name, birthday, email) values ('Evin Radborn', '1992-09-25', 'eradborns@jalbum.net');
insert into employee (name, birthday, email) values ('Ram De Dantesie', '1999-04-13', 'rdet@statcounter.com');
insert into employee (name, birthday, email) values ('Lorry Antecki', '1998-08-25', 'lanteckiu@de.vu');
insert into employee (name, birthday, email) values ('Tabbitha Marsay', '1996-09-14', 'tmarsayv@sourceforge.net');
insert into employee (name, birthday, email) values ('Harold Pillman', '1993-04-04', 'hpillmanw@dion.ne.jp');
insert into employee (name, birthday, email) values ('Lettie Cheney', '1996-04-08', 'lcheneyx@ning.com');
insert into employee (name, birthday, email) values ('Pavla Matignon', '1996-03-22', 'pmatignony@uol.com.br');
insert into employee (name, birthday, email) values ('Reggis Forre', '1996-01-16', 'rforrez@wufoo.com');
insert into employee (name, birthday, email) values ('Augusta Ferrieres', '1999-07-28', 'aferrieres10@opera.com');
insert into employee (name, birthday, email) values ('Yolanda McAdam', '1997-04-14', 'ymcadam11@webnode.com');
insert into employee (name, birthday, email) values ('Nerty Tocknell', '1995-03-21', 'ntocknell12@biglobe.ne.jp');
insert into employee (name, birthday, email) values ('Clay Heckney', '1992-03-31', 'checkney13@scientificamerican.com');
insert into employee (name, birthday, email) values ('Davey Peasegood', '1995-01-12', 'dpeasegood14@weibo.com');
insert into employee (name, birthday, email) values ('Ree MacFadzean', '1999-01-28', 'rmacfadzean15@geocities.com');
insert into employee (name, birthday, email) values ('Erwin Samms', '1994-09-08', 'esamms16@prlog.org');
insert into employee (name, birthday, email) values ('Jessamine Spruce', null, null);
insert into employee (name, birthday, email) values ('Cynthie Auletta', '1997-10-24', 'cauletta18@themeforest.net');
insert into employee (name, birthday, email) values ('Cooper Loy', null, null);
insert into employee (name, birthday, email) values ('Pearce Riseborough', '1999-06-04', 'priseborough1a@geocities.jp');
insert into employee (name, birthday, email) values ('Chandler Campa', '1999-08-12', 'ccampa1b@ow.ly');
insert into employee (name, birthday, email) values ('Sherri Dionisi', '1998-05-05', 'sdionisi1c@seesaa.net');
insert into employee (name, birthday, email) values ('Hali Stubbs', '1993-05-10', 'hstubbs1d@meetup.com');

Select * From employee;
/*
Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
*/
UPDATE employee
SET name = 'Batuhan Güven',
WHERE id = '1';

UPDATE employee
SET birthday = '1999-12-16',
	email = 'batuhanguvenn@outlook.com'
WHERE id = '1' AND name = 'Batuhan Güven'
RETURNING *;

/*
Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/
DELETE FROM employee
WHERE id = '1'
RETURNING *;