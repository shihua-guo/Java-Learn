package com.binana.noClassDefineDemo;
/**
 * 模拟构造器处出现异常，并不会导致NoClassDefFoundError
 */
public class C {
    public C(){
        int i = 1/0;
    }
}