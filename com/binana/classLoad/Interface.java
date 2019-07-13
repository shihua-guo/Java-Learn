package com.binana.classLoad;
import static com.binana.classLoad.Println.println;
public interface Interface{
    Object x = new Object(){
        {
            println("接口成员变量X中的动态代码块");
        }
    };
    Object y = new Object(){
        {
            println("接口成员变量Y中的动态代码块");
        }
    };
}