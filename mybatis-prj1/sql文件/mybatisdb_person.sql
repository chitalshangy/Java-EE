create table person
(
    id        tinyint(2)                          not null
        primary key,
    name      varchar(20) collate utf8_unicode_ci null,
    age       int                                 null,
    idcard_id tinyint(2)                          null,
    constraint idcard_id
        foreign key (idcard_id) references idcard (id)
);

INSERT INTO mybatisdb.person (id, name, age, idcard_id) VALUES (1, 'first_name', 111, 1);
INSERT INTO mybatisdb.person (id, name, age, idcard_id) VALUES (2, 'second_name', 222, 2);
INSERT INTO mybatisdb.person (id, name, age, idcard_id) VALUES (3, 'third_name', 333, 3);
INSERT INTO mybatisdb.person (id, name, age, idcard_id) VALUES (4, 'forth_name', 444, 4);
INSERT INTO mybatisdb.person (id, name, age, idcard_id) VALUES (5, 'fifth_name', 555, 5);