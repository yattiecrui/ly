package com.ly.service1.service;

import com.ly.service1.hystric.FeignServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service2",fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping("teacher/getTeacher")
    Object getTeacherByFeign();
}
