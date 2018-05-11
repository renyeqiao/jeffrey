package org.jeffrey.function;

import org.junit.Test;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-10 15:56
 **/
public class FunctionListTest {

    private FunctionList functionList = new FunctionList();

    @Test
    public void testEcho(){
        functionList.echo(FunctionList.ARRAY_LIST);
        functionList.echo(FunctionList.LINKED_LIST);
    }
}
