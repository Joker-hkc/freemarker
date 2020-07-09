package com.qisi.freemarker.controller;

import com.alibaba.fastjson.JSONObject;
import com.qisi.freemarker.pojo.user;
import com.qisi.freemarker.service.Interface.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: demo
 * @ClassName: UserController
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/2  17:47
 **/
@Controller
public class UserController {
    private static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    public String queall(Model model){
        JSONObject json=new JSONObject();

                List<user> u= userService.all();
                json.put("user",u);

        String jsson=json.toJSONString();
        logger.info(jsson+"101");
        model.addAttribute("user",jsson);
        model.addAttribute("uu",u);

       return "excel";
    }
}
