package com.ly.service1.service;

import com.ly.model.Student;
import com.ly.service.TestService;
import com.ly.service1.mapper.TestMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public List<Student> getStudent() {
        Student student = new Student();
        student.setId(1);
        return testMapper.select(student);
    }

    @Override
    public List<Student> getStudentByMybatis() {
        return testMapper.getStudent();
    }

}
