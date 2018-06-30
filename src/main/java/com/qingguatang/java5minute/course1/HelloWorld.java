package com.qingguatang.java5minute.course1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张宇
 */

@RestController
public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        String message = "Hello";
        return message;
    }

}
