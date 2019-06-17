package com.example.demo.contoller;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学生信息
 * @author Mr.Huang
 * @version 1.0
 * @date 2019/5/22 22:06
 */
@RequestMapping("student")
@RestController
public class StudentContoller {

    @Autowired
    private StudentService studentService;

    @RequestMapping("findStudentInfo")
    public Map<String,Object> findStudentInfo(){

        Map<String,Object> resultMap = new HashMap<>();
        List<Student> resultList =  studentService.findStudentInfo();
        resultMap.put("code","SUCCESS");
        resultMap.put("msg","查询成功");
        resultMap.put("data",resultList);
        return resultMap;

    }


}
