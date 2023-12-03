package com.yj.spring6.xmlaop;

/**
 * @author YangJian
 * @date 2023/11/25 22:03
 * @description
 */
public class SpecialVal {
    private String name;

    public SpecialVal() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpecialVal{" +
                "name=" + name +
                '}';
    }
}
