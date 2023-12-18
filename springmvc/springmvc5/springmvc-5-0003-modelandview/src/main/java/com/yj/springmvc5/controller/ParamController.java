package com.yj.springmvc5.controller;

import com.yj.springmvc5.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author YangJian
 * @date 2023/12/14 9:50
 * @description
 */
@Controller
public class ParamController {
    @RequestMapping("/testsaveByServletAPI")
    public String testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        request.setAttribute("username", username);
        Object username1 = request.getAttribute("username");
        System.out.println("username1===="+username1);
        return "success";
    }
    @RequestMapping("/testGetByServletAPI")
    public String testGetByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println("username=="+username);

        // 获取是null，
        Object username1 = request.getAttribute("username");
        System.out.println("username2===="+username1);
        return "success";
    }

    /**
     *
     * 使用ModelAndView返回类型必须是ModelAndView
     */
    @RequestMapping("/testsaveByModelAndView")
    public ModelAndView testsaveByModelAndView(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView mv = new ModelAndView();
        //向请求域共享数据
        mv.addObject("username",username);
        //设置视图，实现页面跳转
        mv.setViewName("success");

        return mv;
    }
    @RequestMapping("/testsaveByModel")
    public String testsaveByModel(HttpServletRequest request, Model model){
        System.out.println("model=="+ model.toString());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        model.addAttribute("username",username);

        // 获取username
        Object username1 = model.getAttribute("username");
        System.out.println("username1=="+username1);

        return "success";
    }

    @RequestMapping("/testsaveByMap")
    public String testsaveByMap(HttpServletRequest request, Map<String, Object> map){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        map.put("username",username);

        // 获取username
        Object username1 = map.get("username");
        System.out.println("username1=="+username1);

        return "success";
    }
    @RequestMapping("/testsaveByModelMap")
    public String testsaveByModelMap(HttpServletRequest request, ModelMap modelMap){
        System.out.println("modelMap=="+ modelMap.toString());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        modelMap.addAttribute("username",username);

        // 获取username
        Object username1 = modelMap.getAttribute("username");
        System.out.println("username1=="+username1);

        return "success";
    }

    @RequestMapping("/testsaveBySession")
    public String testsaveBySession(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        HttpSession session = request.getSession();
        session.setAttribute("username",username);



        return "success";
    }

    @RequestMapping("/testGetBySession")
    public String testGetBySession(HttpServletRequest request){
        HttpSession session = request.getSession();
        Object username1 = session.getAttribute("username");
        System.out.println("session===="+username1);

        return "success";
    }

    @RequestMapping("/testsaveByServletContext")
    public String testsaveByServletContext(HttpServletRequest request, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=="+username);
        System.out.println("password=="+password);

        ServletContext application = session.getServletContext();
        application.setAttribute("username",username);



        return "success";
    }

    @RequestMapping("/testGetByServletContext")
    public String testGetByServletContext(HttpServletRequest request,HttpSession session){
        ServletContext application = session.getServletContext();
        Object username1 = application.getAttribute("username");
        System.out.println("ServletContext===="+username1);

        return "success";
    }

    @RequestMapping(value = {"/testpojo"},
    method = {RequestMethod.POST},
    params = {"username","password!=123456"})
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }
}
