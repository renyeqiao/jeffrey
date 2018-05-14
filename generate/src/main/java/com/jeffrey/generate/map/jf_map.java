package com.jeffrey.generate.map;

import java.util.HashMap;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description: map类
 * @create: 2018-04-25 21:08
 **/
public class jf_map {


    /**
     * hashMap源码解析
     * hashcode的生成规则：
     *
     * @param args
     */
    public static void main(String args[]) throws InterruptedException {
        HashMap hashMap = new HashMap<String,String>();
        int i = 0 ;
        for(;;){
            hashMap.put("a"+(i++),"a") ;
        }
    }

}
