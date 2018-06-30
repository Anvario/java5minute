package com.qingguatang.java5minute.course1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 张宇
 */

@Controller
public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        String message = "Hello";
        return message;
    }

}
