package com.binana.noClassDefineDemo;
/**
 * 静态代码块中的异常
 */
public class B {
    static {
        int i = 1/0;
    }
}