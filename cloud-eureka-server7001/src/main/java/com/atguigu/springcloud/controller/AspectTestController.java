package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.annotation.MyAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/12/4 20:12
 * @Version 1.0
 */
@RestController
public class AspectTestController {

    @MyAnnotation
    @GetMapping("/root/{args}")
    public Object getArgs(@PathVariable("args") String arg){
        return arg;
    }

    @GetMapping("/test/{str}")
    public Object test(@PathVariable("str") String string){
        return string;
//        return "welcome to test!";
    }

}
