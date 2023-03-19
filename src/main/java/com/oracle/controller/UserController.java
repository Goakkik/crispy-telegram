package com.oracle.controller;

import com.oracle.mapper.StudentMapper;
import com.oracle.pojo.Student;
import com.oracle.pojo.User;
import com.oracle.service.StudentService;
import com.oracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){
        User loginUser = userService.login(userName, password);
        System.out.println(loginUser);
        if (loginUser!=null){
            session.setAttribute("loginUser",loginUser);
            return "redirect:adminMain.html";
        }else {
            model.addAttribute("msg","账号或密码错误！");
            return"index";
        }
    }
    @RequestMapping("/adminMain.html")
    public String toAdminMain(){
        /*List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("studentList",studentList);*/
        return "admin/adminMain";
    }
}
