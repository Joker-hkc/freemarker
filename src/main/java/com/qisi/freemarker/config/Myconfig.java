package com.qisi.freemarker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: freemarker
 * @ClassName: Myconfig
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/6  15:13
 **/
@Configuration
public class Myconfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String[] addPathPatterns={"/all"};
registry.addInterceptor(new FMInterceptor()).addPathPatterns(addPathPatterns);
    }
}
