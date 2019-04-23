package com.ly.service2.service;

import com.ly.model.Teacher;
import com.ly.service.TeacherService;
import com.ly.service2.mapper.TeacherMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeacher() {
        Teacher teacher = new Teacher();
        teacher.setId(2);
        return teacherMapper.select(teacher);
    }

}
