package com.example.demo.service.Impl;

import com.example.demo.service.StudentsService;
import com.example.demo.dao.StudentsMapper;
import com.example.demo.model.Students;
import com.example.demo.model.StudentsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hua on 2018-04-03.
 * Describe:
 */

@Service("studentsService")
public class StudentsServiceImpl implements StudentsService{

    @Resource
    private StudentsMapper studentsMapper;

    @Override
    public Students queryStudentsById(Integer id) {
        Students students = studentsMapper.selectByPrimaryKey(id);
        return students;
    }

    @Override
    public List<Students> queryStudentsByName(String name) {
        StudentsExample e = new StudentsExample();
        e.createCriteria().andNameEqualTo(name);
        List<Students> list = studentsMapper.selectByExample(e);
        return list;
    }
}
