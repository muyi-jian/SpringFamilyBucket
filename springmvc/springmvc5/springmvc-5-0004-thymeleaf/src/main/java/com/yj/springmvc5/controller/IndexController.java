package com.yj.springmvc5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangJian
 * @date 2023/12/14 9:50
 * @description
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("重定向====1======");
        return "redirect:/testHello";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("转发====1======");
        return "forward:/testHello";
    }

    @RequestMapping("/testHello")
    public String testHello(){
        System.out.println("testHello=============");
        return "hello";
    }
}
