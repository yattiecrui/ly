package com.ly.service1.controller;


import com.ly.service.TestService;
import com.ly.service1.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;
    @Autowired
    RestTemplate restTemplate;
    @Resource
    FeignService feignService;

    @RequestMapping("getStudent")
    public Object test(){
        return testService.getStudent();
    }

    @RequestMapping("getStudent2")
    public Object testV2(){
        return testService.getStudentByMybatis();
    }

    @RequestMapping("getTeacher")
    public Object test2(){
        return restTemplate.getForObject("http://service2/teacher/getTeacher", Object.class);
    }

    @RequestMapping("getTeacherByFeign")
    public Object test3(){
        return feignService.getTeacherByFeign();
    }

    @RequestMapping("/logTest")
    public void demo1() {
        log.info("测试{}，日志级别{}，输出{}", "demo1", "info", "info level log");

        log.error("测试{}，日志级别{}，输出{}", "error", "error", "error level log");
    }

}
