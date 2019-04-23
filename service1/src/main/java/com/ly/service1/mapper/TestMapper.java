package com.ly.service1.mapper;

import com.ly.core.MyMapper;
import com.ly.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper extends MyMapper<Student> {

    @Select("select * from student")
    List<Student> getStudent();

}
