package com.oracle.mapper;

import com.oracle.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {
    /**
     *          查找所有学生
     * @return  学生的集合
     */
    List<Student> selectAllStudents();

    /**
     *                  根据学号查找学生
     * @param stuId     学号
     * @return          找到的学生
     */
    Student selectStudentByStuId(@Param("stuId") Integer stuId);


    /**
     * 添加学生
     * @param student   添加的学生
     * @return          影响行数
     */
    int insertStudent(Student student);

    /**
     *              删除学生
     * @param stuId 学号
     * @return      影响行数
     */
    int deleteStudentBystuId(@Param("stuId") Integer stuId);

}
