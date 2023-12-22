package com.yj.springboot3.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YangJian
 * @date 2023/12/22 11:09
 * @description
 * `@PropertySource`用于指定加载的外部属性文件，可以使用${}表达式引用外部文件中的属性值。
 */
@ConfigurationProperties(value = "dog2" )
public class Dog2 {

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
