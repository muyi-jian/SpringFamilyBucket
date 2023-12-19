package com.yj.springmvc.init.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangJian
 * @date 2023/12/19 14:41
 * @description
 */
@Controller
public class InitController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
