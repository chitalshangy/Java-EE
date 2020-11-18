package com.mybatis.po;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private List<Order> orderList;

    public Customer() {
    }

    public Customer(int id, String name, String phone, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
