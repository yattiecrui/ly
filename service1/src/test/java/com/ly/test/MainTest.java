package com.ly.test;

import com.ly.service1.Service1Application;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Service1Application.class)
public class MainTest {

    @Resource
    private StringEncryptor stringEncryptor;

    @Test
    public void encrypt(){
        String a = stringEncryptor.encrypt("Liuyong123!aa");
        System.out.println(a);
    }
}
