package com.oracle.controller;

import com.oracle.pojo.Student;
import com.oracle.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student")
    public String getAllStudents(Model model){
        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("studentList",studentList);
        return "student/student_list";
    }
}
