package com.yj.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @author YangJian
 * @date 2023/12/6 16:30
 * @description
 */
public class TestI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //传递动态参数，使用数组形式对应{0} {1}顺序
        Object[] objs = new Object[]{"张三",new Date().toString()};

        //www.atguigu.com为资源文件的key值,
        //objs为资源文件value值所需要的参数,Local.CHINA为国际化为语言
        String str=context.getMessage("www.yj.com", objs, Locale.CHINA);
        //String str=context.getMessage("www.yj.com", objs, Locale.US);

        System.out.println(str);
    }
}
