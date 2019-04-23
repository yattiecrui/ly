package com.ly.service;

import com.ly.model.Student;

import java.util.List;

public interface TestService {
    List<Student> getStudent();

    List<Student> getStudentByMybatis();
}
