package com.oracle.interceptor;

import com.oracle.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        session.getAttribute("loginUser");
        User loginUser = (User)session.getAttribute("loginUser");
        if (loginUser!=null){
            return true;
        }
        request.setAttribute("msg","请先登录！");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}

