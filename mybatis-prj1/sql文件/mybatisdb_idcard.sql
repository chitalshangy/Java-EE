create table idcard
(
    id   tinyint(2) auto_increment
        primary key,
    code varchar(18) collate utf8_unicode_ci null
);

INSERT INTO mybatisdb.idcard (id, code) VALUES (1, 'code11');
INSERT INTO mybatisdb.idcard (id, code) VALUES (2, 'code22');
INSERT INTO mybatisdb.idcard (id, code) VALUES (3, 'code33');
INSERT INTO mybatisdb.idcard (id, code) VALUES (4, 'code44');
INSERT INTO mybatisdb.idcard (id, code) VALUES (5, 'code55');