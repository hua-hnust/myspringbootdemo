package com.example.demo.service;

import com.example.demo.model.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

/**
 * Created by xhua on 2018-10-23.
 * Describe:
 */

//这两个注解解决了service的注入问题
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsServiceTest {

    @Autowired
    private StudentsService studentsService;

    @Test
    public void studentsServiceTest(){
        List<Students> students = studentsService.queryStudentsByName("小红");
        students.forEach(student->{
            System.out.println(student.getName()+":"+student.getAge());
        });
    }

    @Test
    public void test(){
        System.out.println("test");
    }

}
