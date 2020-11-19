create table customer
(
    id    int(20) auto_increment
        primary key,
    name  varchar(20) null,
    phone varchar(20) null
);

INSERT INTO mybatisdb.customer (id, name, phone) VALUES (1, '11', '111111111');
INSERT INTO mybatisdb.customer (id, name, phone) VALUES (2, '22', '222222222');
INSERT INTO mybatisdb.customer (id, name, phone) VALUES (3, '33', '333333333');