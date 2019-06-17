package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

/**
 * 学生接口
 */
public interface StudentService {
    /**
     * 查询学生信息
     * @return  List<Student> 学生信息列表
     */
    List<Student> findStudentInfo();
}
