package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Address {
    private int addressId;
    private String detail;
    private String zipcode;
    private String phone;
    private String type;
    //private Set<Customer> customers = new HashSet(0);
    private Customer cust_id;

    public Address() {
    }

    public Address(int addressId, String detail, String zipcode, String phone, String type, Customer cust_id) {
        this.addressId = addressId;
        this.detail = detail;
        this.zipcode = zipcode;
        this.phone = phone;
        this.type = type;
        //his.customers=customers;
        this.cust_id=cust_id;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    /*
    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set customers) {
        this.customers = customers;
    }
    */

    public Customer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Customer cust_id) {
        this.cust_id = cust_id;
    }
}

