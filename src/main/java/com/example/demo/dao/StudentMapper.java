package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学生信息
 */
@Mapper
public interface StudentMapper {

    /**
     * 查询学生信息
     */
    List<Student> findStudentInfo();

}
