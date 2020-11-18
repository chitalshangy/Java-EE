package com.mybatis.po;

public class Idcard {
    private int id;
    private String code;

    public Idcard() {
    }

    public Idcard(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
