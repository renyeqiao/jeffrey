package com.jeffrey.generate.string;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description: 字符工具类
 * @create: 2018-04-25 21:00
 **/
public class Jf_String {

//    hashCode源码分析
//    public int hashCode() {
//        int h = hash;                                 初始化值是0
//        if (h == 0 && value.length > 0) {
//            char val[] = value;                       字符串转换成char数组 后续循环遍历
//
//            for (int i = 0; i < value.length; i++) {  遍历数组
//                h = 31 * h + val[i];                  生成hash散列值(2^5 -1 )*h + 字符的ASCII码
//            }
//            hash = h;
//        }
//        return h;
//    }



    public static void main(String[] args) {
        String s = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int hashCode = new Object().hashCode();//地址指针
        int hashCode2 = new Object().hashCode();
        System.out.print(hashCode+"--------"+hashCode2);
    }

}
