package org.jeffrey.function;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-10 15:47
 **/
public class FunctionList {

    static ArrayList<String> ARRAY_LIST = new ArrayList<String>() {
        {
            add("one");
            add("two");
        }
    };

    static LinkedList<String> LINKED_LIST = new LinkedList<String>() {
        {
            add("l_one");
            add("l_two");
        }
    };

    void echo(List list) {
        final String[] result = {null};
        list.forEach((a)->{
            System.out.println(a);
        });
    }

}
