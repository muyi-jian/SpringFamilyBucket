package com.yj.spring6.xmlaop;

/**
 * @author YangJian
 * @date 2023/11/25 21:39
 * @description
 */
public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //@Override
    //public String toString() {
    //    return "Student{" +
    //            "id=" + id +
    //            ", name='" + name + '\'' +
    //            ", age=" + age +
    //            ", sex='" + sex + '\'' +
    //            '}';
    //}


    // 引用 外部bean 测试用
    private Clazz clazz;

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
