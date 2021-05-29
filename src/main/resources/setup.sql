create table person(id serial not null primary key, name text not null);
create table pet(id serial not null primary key, owner_id int not null references person(id),  name text, type text);
create sequence hibernate_sequence start 1;
insert into person (name) values('Aaron'), ('Jen');
insert into pet (name,owner_id,type) values('Hazy',1,'Gerbil'), ('Udvar',2,'Gerbil'), ('Gus',1,'Dog');

select p.name,pet.name,pet.type from person p join pet on p.id = pet.owner_id;
