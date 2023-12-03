package com.yj.spring6.xmlaop;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 特殊数据类型
 * @author YangJian
 * @date 2023/11/26 21:06
 * @description
 */
public class SpecialType {
    // 数组
    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void show() {
        System.out.println(Arrays.toString(hobbies));
    }

    private List<Clazz> clazz;

    public List<Clazz> getClazz() {
        return clazz;
    }

    public void setClazz(List<Clazz> clazz) {
        this.clazz = clazz;
    }

    //@Override
    //public String toString() {
    //    return "SpecialType{" +
    //            "hobbies=" + Arrays.toString(hobbies) +
    //            ", clazz=" + clazz +
    //            '}';
    //}

    // map
    private Map<String, Student1> student1Map;

    public Map<String, Student1> getStudent1Map() {
        return student1Map;
    }

    public void setStudent1Map(Map<String, Student1> student1Map) {
        this.student1Map = student1Map;
    }

    @Override
    public String toString() {
        return "SpecialType{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", clazz=" + clazz +
                ", student1Map=" + student1Map +
                '}';
    }
}
