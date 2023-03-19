package com.oracle.service;

import com.oracle.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     *          获取所有学生信息
     * @return  学生集合
     */
    List<Student> getAllStudents();

    Student getStudentByStuId(Integer stuId);

    boolean addStudent(Student student);

    boolean deleteStudentByStuId(Integer stuId);

}
