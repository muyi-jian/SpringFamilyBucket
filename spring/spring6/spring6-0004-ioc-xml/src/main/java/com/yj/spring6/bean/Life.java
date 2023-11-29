package com.yj.spring6.bean;

/**
 * @author YangJian
 * @date 2023/11/29 21:10
 * @description
 */
public class Life {
    private String name;

    public Life() {
        System.out.println("生命周期：1  创建对象");
    }

    public Life(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println( "生命周期：2  依赖注入");
        this.name = name;
    }

    public void initMethod(){
        System.out.println("生命周期：3  初始化");
    }

    public void destroyMethod(){
        System.out.println("生命周期：5  销毁");
    }

}
