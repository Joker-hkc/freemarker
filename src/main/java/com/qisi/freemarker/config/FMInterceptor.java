package com.qisi.freemarker.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: freemarker
 * @ClassName: FMInterceptor
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/6  15:07
 **/
public class FMInterceptor implements HandlerInterceptor {

    private Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info(request.getRequestURI());
        return true;
    }
}
