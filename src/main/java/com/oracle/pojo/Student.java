package com.oracle.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Student {
    private Integer stuId;
    private String stuName;
    private String sex;
    private Date birthday;
    private String phone;
    private String address;
    private String edu;
    private Integer gradeId;
}
