package com.jeffrey.aop;

import com.jeffrey.aop.jdk.Resource;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-21 20:38
 **/
public class UserServiceImpl implements UserService {


    @Resource("Henry")
    private String name;


    @Override
    public String getName(int id) {
        System.out.println("do something");
        return null;
    }

    @Override
    public Integer getAge(int id) {
        return null;
    }
}
