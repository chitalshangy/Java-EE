package com.mybatis.po;

public class Order {
    private int id;
    private String content;
    private Customer cust_id;

    public Order() {
    }

    public Order(int id, String content, Customer cust_id) {
        this.id = id;
        this.content = content;
        this.cust_id = cust_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Customer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Customer cust_id) {
        this.cust_id = cust_id;
    }
}
