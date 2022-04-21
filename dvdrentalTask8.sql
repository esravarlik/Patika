CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) Not NULL,
	birthday DATE,
	email VARCHAR(100)
);


insert into employee (name, email, birthday) values ('Anjanette', 'agert0@cmu.edu', '3/24/2022');
insert into employee (name, email, birthday) values ('Kelby', 'kwilmott1@paypal.com', '10/25/2021');
insert into employee (name, email, birthday) values ('Buckie', 'bropartz2@usgs.gov', '3/9/2022');
insert into employee (name, email, birthday) values ('Joshuah', 'jissatt3@nih.gov', '10/26/2021');
insert into employee (name, email, birthday) values ('Valentin', 'vpalister4@exblog.jp', '4/15/2022');
insert into employee (name, email, birthday) values ('Gil', 'gfidler5@apache.org', '6/24/2021');
insert into employee (name, email, birthday) values ('Gradey', 'gstriker6@multiply.com', '11/2/2021');
insert into employee (name, email, birthday) values ('Maddalena', 'mmartyntsev7@tmall.com', '12/19/2021');
insert into employee (name, email, birthday) values ('Kessiah', 'kkyncl8@weebly.com', '12/15/2021');
insert into employee (name, email, birthday) values ('Swen', 'sgoacher9@cisco.com', '8/15/2021');
insert into employee (name, email, birthday) values ('Torey', 'tubsdella@craigslist.org', '10/28/2021');
insert into employee (name, email, birthday) values ('Bertie', 'bmathetb@arizona.edu', '6/18/2021');
insert into employee (name, email, birthday) values ('Ozzie', 'ocordeixc@bbb.org', '5/22/2021');
insert into employee (name, email, birthday) values ('Victoir', 'vdraked@illinois.edu', '11/21/2021');
insert into employee (name, email, birthday) values ('Ricardo', 'rinkere@ihg.com', '3/28/2022');
insert into employee (name, email, birthday) values ('Marietta', 'mbeatsonf@oaic.gov.au', '5/20/2021');
insert into employee (name, email, birthday) values ('Hurlee', 'hbursellg@wisc.edu', '10/31/2021');
insert into employee (name, email, birthday) values ('Vally', 'vcastelluccih@smh.com.au', '9/13/2021');
insert into employee (name, email, birthday) values ('Michel', 'mconfordi@plala.or.jp', '1/21/2022');
insert into employee (name, email, birthday) values ('Sean', 'socklinj@spiegel.de', '6/16/2021');
insert into employee (name, email, birthday) values ('Mariam', 'mnickolsk@rakuten.co.jp', '7/20/2021');
insert into employee (name, email, birthday) values ('Agustin', 'ahabbershonl@hibu.com', '10/19/2021');
insert into employee (name, email, birthday) values ('Mercedes', 'mpymmm@facebook.com', '5/7/2021');
insert into employee (name, email, birthday) values ('Ber', 'bdowneyn@meetup.com', '5/31/2021');
insert into employee (name, email, birthday) values ('Flin', 'fbonhommeo@shareasale.com', '1/6/2022');
insert into employee (name, email, birthday) values ('Ferne', 'fmccoughanp@e-recht24.de', '2/15/2022');
insert into employee (name, email, birthday) values ('Lennard', 'lsolomonidesq@goo.gl', '6/8/2021');
insert into employee (name, email, birthday) values ('Pollyanna', 'pcodlinr@miitbeian.gov.cn', '7/23/2021');
insert into employee (name, email, birthday) values ('Ricardo', 'rstretes@qq.com', '10/9/2021');
insert into employee (name, email, birthday) values ('Cyrill', 'cgetshamt@last.fm', '3/10/2022');
insert into employee (name, email, birthday) values ('Fiorenze', 'fdreameru@berkeley.edu', '6/16/2021');
insert into employee (name, email, birthday) values ('Dulcia', 'dbellwoodv@about.com', '1/10/2022');
insert into employee (name, email, birthday) values ('Corbet', 'cmagnayw@cbsnews.com', '7/2/2021');
insert into employee (name, email, birthday) values ('Sara-ann', 'sbuxtonx@marriott.com', '6/1/2021');
insert into employee (name, email, birthday) values ('Berti', 'bferraroy@tripod.com', '12/24/2021');
insert into employee (name, email, birthday) values ('Sela', 'skenwellz@shop-pro.jp', '11/16/2021');
insert into employee (name, email, birthday) values ('Martica', 'mdittson10@odnoklassniki.ru', '10/26/2021');
insert into employee (name, email, birthday) values ('Guilbert', 'gwillsmore11@cnbc.com', '9/5/2021');
insert into employee (name, email, birthday) values ('Harwell', 'htotterdell12@redcross.org', '3/20/2022');
insert into employee (name, email, birthday) values ('Jacklin', 'jwhitchurch13@newyorker.com', '12/6/2021');
insert into employee (name, email, birthday) values ('Albina', 'atandy14@altervista.org', '10/9/2021');
insert into employee (name, email, birthday) values ('Gunilla', 'galtamirano15@netvibes.com', '9/30/2021');
insert into employee (name, email, birthday) values ('Rebbecca', 'rmchirrie16@sun.com', '8/31/2021');
insert into employee (name, email, birthday) values ('Liana', 'lmcaviy17@slashdot.org', '1/16/2022');
insert into employee (name, email, birthday) values ('Morris', 'mcantos18@businesswire.com', '10/21/2021');
insert into employee (name, email, birthday) values ('Ignace', 'ibolingbroke19@bloglovin.com', '11/26/2021');
insert into employee (name, email, birthday) values ('Lauri', 'ldrance1a@cafepress.com', '9/7/2021');
insert into employee (name, email, birthday) values ('Albert', 'afearnyhough1b@hubpages.com', '2/14/2022');
insert into employee (name, email, birthday) values ('Brook', 'bluckhurst1c@altervista.org', '2/26/2022');
insert into employee (name, email, birthday) values ('Booth', 'bnormanvill1d@pbs.org', '1/10/2022');


UPDATE employee
SET name = 'Ignace', email = 'ldrance1a@cafepress.com', birthday = '9/7/2001'
WHERE id = 10;

UPDATE employee
SET name = 'Albina', email = 'atandy14@altervista.org', birthday = '10/9/2011'
WHERE id = 20;

UPDATE employee
SET name = 'Mercedes', email = 'atandy14@altervista.org', birthday = '5/7/2021'
WHERE id = 25;

UPDATE employee
SET name = 'Gil', email = 'gfier5@apache.org', birthday = '3/24/2021'
WHERE id = 21;

UPDATE employee
SET name = 'Valentin', email = 'vpalister4@exblog.jp', birtday = '4/4/2022'
WHERE id = 33;


DELETE FROM employee
WHERE id = 12
RETURNING *;

DELETE FROM employee
WHERE id =22
RETURNING *;

DELETE FROM employee
WHERE id = 2
RETURNING *;

DELETE FROM employee
WHERE id = 40
RETURNING *;

DELETE FROM employee
WHERE id = 9
RETURNING *;
