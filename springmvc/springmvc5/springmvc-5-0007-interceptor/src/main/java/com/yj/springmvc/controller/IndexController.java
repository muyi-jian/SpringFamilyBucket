package com.yj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangJian
 * @date 2023/12/15 9:51
 * @description
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "interceptor";
    }

}
