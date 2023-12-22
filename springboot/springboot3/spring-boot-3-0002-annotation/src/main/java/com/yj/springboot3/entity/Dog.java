package com.yj.springboot3.entity;


import org.springframework.beans.factory.annotation.Value;

/**
 * @author YangJian
 * @date 2023/12/22 11:09
 * @description
 * `@Value`可以用于注入单个属性值，支持SpEL表达式，可以直接将配置文件中的值注入到Java对象中
 *  在properties配置文件中配置数据
 */

public class Dog {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private Integer age;

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
