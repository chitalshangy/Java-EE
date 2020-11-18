package com.pojo;

public class SelectPersonById {
    private Integer id;
    private String name;
    private Integer age;
    private String code;

    public SelectPersonById() {
    }

    public SelectPersonById(Integer id, String name, Integer age, String code) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SelectPersonById{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", code='" + code + '\'' +
                '}';
    }
}