package com.example.demo.service;

import com.example.demo.model.Students;

import java.util.List;

/**
 * Created by hua on 2018-04-03.
 * Describe:
 */
public interface StudentsService {
    Students queryStudentsById(Integer id);

    List<Students> queryStudentsByName(String name);
}
