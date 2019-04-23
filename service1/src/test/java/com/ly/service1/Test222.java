package com.ly.service1;

public class Test222 implements Test111 {

    @Override
    public String proxyTest(String string) {
        return "aaa:::"+string;
    }
}
