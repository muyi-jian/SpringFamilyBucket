package com.yj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangJian
 * @date 2023/11/15 14:12
 * @description
 */
@Controller
public class HelloController {
    //  通过@RequestMapping注解，可以通过请求路径匹配要处理的具体的请求
    //  /表示的当前工程的上下文路径
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //第一种
    @RequestMapping("/hello")
    public String toHello(){
        return "hello";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
