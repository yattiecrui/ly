package com.ly.service2.controller;


import com.ly.model.Teacher;
import com.ly.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("getTeacher")
    public Object test(){
        List<Teacher> teacher = teacherService.getTeacher();
        return teacher;
    }

}
