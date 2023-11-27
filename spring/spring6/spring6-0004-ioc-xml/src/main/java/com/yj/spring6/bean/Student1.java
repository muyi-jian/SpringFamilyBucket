package com.yj.spring6.bean;

/**
 * @author YangJian
 * @date 2023/11/25 21:39
 * @description
 */
public class Student1 {
    private Integer id;

    private String name;


    public Student1() {
    }

    public Student1(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
