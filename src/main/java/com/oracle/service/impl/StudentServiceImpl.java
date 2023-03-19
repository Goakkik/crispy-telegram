package com.oracle.service.impl;

import com.oracle.mapper.StudentMapper;
import com.oracle.pojo.Student;
import com.oracle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectAllStudents();
    }

    @Override
    public Student getStudentByStuId(Integer stuId) {
        return studentMapper.selectStudentByStuId(stuId);
    }

    @Override
    public boolean addStudent(Student student) {
        return studentMapper.insertStudent(student)>0;
    }

    @Override
    public boolean deleteStudentByStuId(Integer stuId) {
        return studentMapper.deleteStudentBystuId(stuId)>0;
    }
}
