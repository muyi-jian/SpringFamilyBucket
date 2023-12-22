package com.yj.springboot3.controller;

import com.yj.springboot3.entity.Dog;
import com.yj.springboot3.entity.Dog1;
import com.yj.springboot3.entity.Dog2;
import com.yj.springboot3.entity.User;
import com.yj.springboot3.service.UserService;
import com.yj.springboot3.service.impl.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangJian
 * @date 2023/12/21 14:51
 * @description
 * `@RestController` 是 Spring MVC 框架中的一个注解，用于标记一个类为 RESTful Web 服务的控制器。它的主要作用是将类中的方法映射到 HTTP 请求上，并返回相应的数据。
 * 以下是 @RestController 的一些详细解释：
 * 简化返回值：使用 @RestController 注解的类中的每个方法都会自动将返回的对象转换为 JSON 格式的字符串，并将其作为 HTTP 响应体发送给客户端。这样，我们不需要手动编写转换逻辑，
 * 可以直接返回对象或集合。
 * 支持多种返回类型：除了默认的 String 类型外，@RestController 还支持其他类型的返回值，如 ResponseEntity、List、Map 等。这使得我们可以灵活地处理不同类型的数据和状态码。
 * 简化路由配置：使用 @RestController 注解的类中的每个方法都会自动生成对应的 URL 路径。我们只需要在方法名前加上相应的 HTTP 动词（如 get()、post()、put() 等），
 * Spring MVC 就会自动将这些方法映射到相应的 URL 路径上。
 * 整合了 @Controller 和 @ResponseBody：@RestController 同时继承了 @Controller 和 @ResponseBody 注解的功能。这意味着我们可以在同一个类中使用这两个注解，
 * 以实现更简洁的代码和更好的可读性。
 */
@RestController
public class TestController {

    @Autowired
    public MyServiceImpl myServiceImpl;

    @Autowired
    public Dog dog;
    @Autowired
    public Dog1 dog1;
    @Autowired
    public Dog2 dog2;
    @GetMapping("/sayHello")
    public String sayHello(){
        myServiceImpl.hello();
        return "ok";
    }
    @GetMapping("/getDog")
    public Dog getDog(){
        return dog;
    }
    @GetMapping("/getDog1")
    public Dog1 getDog1(){
        return dog1;
    }

    @GetMapping("/getDog2")
    public Dog2 getDog2(){
        return dog2;
    }



}
