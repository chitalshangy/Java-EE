create table user
(
    uid   int         not null
        primary key,
    uname varchar(20) null,
    usex  varchar(20) null
);

INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (1, 'shangyang', 'male');
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (2, 'chital', 'female');
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (3, 'admin', null);
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (4, '陈213', '女');
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (5, '2131陈13213', '男');
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (6, '陈111', '男');
INSERT INTO mybatisdb.user (uid, uname, usex) VALUES (7, '213陈', '男');