package com.binana.classLoad;

import static com.binana.classLoad.Println.println;

public class Main{
    public static void main(String[] args){
        try {
            println("--------------创建实例--------------------");
            Instance instance = new Instance();
            println("--------------完成创建第一个实例--------------------");
            instance = new Instance();
            // instance.x.toString();
            println("--------------完成创建第二个实例--------------------");
        } catch (Throwable e) {
            System.out.print("捕获异常");
        }
    }
}