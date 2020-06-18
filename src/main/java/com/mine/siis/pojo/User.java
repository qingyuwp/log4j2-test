package com.mine.siis.pojo;

public class User {

    private Integer id;
    private String  company;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
