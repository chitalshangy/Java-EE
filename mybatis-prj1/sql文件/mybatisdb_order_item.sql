create table order_item
(
    id      int(20) auto_increment
        primary key,
    content varchar(30) null,
    cust_id int(20)     null,
    constraint order_customer__fk
        foreign key (cust_id) references customer (id)
);

INSERT INTO mybatisdb.order_item (id, content, cust_id) VALUES (1, 'soup', 1);
INSERT INTO mybatisdb.order_item (id, content, cust_id) VALUES (2, 'rice', 1);
INSERT INTO mybatisdb.order_item (id, content, cust_id) VALUES (3, 'hamburger', 2);
INSERT INTO mybatisdb.order_item (id, content, cust_id) VALUES (4, 'fish', 3);
INSERT INTO mybatisdb.order_item (id, content, cust_id) VALUES (5, 'rice', 3);