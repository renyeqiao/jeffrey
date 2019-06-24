package com.jeffrey.utils.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

public class TestHashTable {


    @Test
    public void testPut(){
        Hashtable hashtable = new Hashtable();
        System.out.println(hashtable.put("name","任业桥"));
        System.out.println(hashtable.put("name","张三"));
        System.out.println(hashtable.get("name"));

        HashMap map = new HashMap();
        System.out.println(map.put("name","任业桥"));
        System.out.println(map.put("name","张三"));
        System.out.println(map.get("name"));

    }
}
