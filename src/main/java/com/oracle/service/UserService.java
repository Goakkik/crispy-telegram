package com.oracle.service;
import com.oracle.pojo.User;
public interface UserService {
    /**
     *                  登录功能
     * @param userName  用户名
     * @param password  密码
     * @return          登录的用户
     */
    User login(String userName,String password);
}
