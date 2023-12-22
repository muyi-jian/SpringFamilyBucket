package com.yj.springboot3.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author YangJian
 * @date 2023/12/22 11:09
 * @description
 * `@ConfigurationProperties`可以将一个或多个配置文件中的属性映射到Java对象中，也可以使用前缀来匹配属性。
 */
@ConfigurationProperties(prefix = "dog1" )
public class Dog1 {

    private String name;

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
