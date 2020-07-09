package com.qisi.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: freemarker
 * @ClassName: hicontroller
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/6  13:17
 **/
@RestController
public class hicontroller {
    @RequestMapping("/hi")
    public String hi(){
        return "hi";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
