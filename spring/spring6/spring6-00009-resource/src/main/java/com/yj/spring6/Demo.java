package com.yj.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author YangJian
 * @date 2023/12/6 16:01
 * @description
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
//        通过ApplicationContext访问资源
//        ApplicationContext实例获取Resource实例时，
//        默认采用与ApplicationContext相同的资源访问策略
        Resource res = ctx.getResource("test.txt");
        System.out.println(res.getFilename());
        System.out.println(res.getURI());
        System.out.println(res.getInputStream().read());
    }
}
