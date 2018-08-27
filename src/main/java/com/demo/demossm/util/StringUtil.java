package com.demo.demossm.util;


public class StringUtil {
    /**
     * 判断单个字符是否为null或者是一串毫无意义的空格
     * @param str
     * @return 如果不是null或者一串空格，返回true
     */
    public static boolean notEmpty(String... str){
        for (String a:str) {
            if (!(a != null && !"".equals(a.trim()))){
                return false;
            }
        }
        return true;
    }
}
