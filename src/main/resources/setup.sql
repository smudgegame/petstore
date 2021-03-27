create table person(id int not null primary key, name text not null);
create table pet(id int not null primary key, owner_id int not null,  name text, type text);
alter table pet add constraint fk_owner foreign key(owner_id) references person(id);
create sequence hibernate_sequence start 1;