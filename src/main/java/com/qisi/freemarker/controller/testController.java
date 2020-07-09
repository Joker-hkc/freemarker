package com.qisi.freemarker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: freemarker
 * @ClassName: testController
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/9  14:27
 **/
@RestController
public class testController {
    @GetMapping("/test")
    public String test(){
        return "test_success";
    }
}
