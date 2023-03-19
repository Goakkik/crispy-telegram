package com.oracle;

import com.oracle.pojo.Student;
import com.oracle.service.StudentService;
import com.oracle.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyschoolSpringBootApplicationTests {
    @Autowired
    private StudentService service;

    @Test
    void contextLoads() {

        List<Student> allStudents = service.getAllStudents();
        System.out.println(allStudents);
    }

}
