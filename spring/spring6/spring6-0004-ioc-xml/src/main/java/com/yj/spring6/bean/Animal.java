package com.yj.spring6.bean;

/**
 * @author YangJian
 * @date 2023/11/28 20:50
 * @description
 */
public class Animal {
    private String name;
    private String age;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
