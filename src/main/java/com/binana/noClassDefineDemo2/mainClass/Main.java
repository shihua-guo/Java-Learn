package com.binana.noClassDefineDemo2.mainClass;
import com.binana.noClassDefineDemo2.needClass.NeedClass;
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello!I am Main Class!");
        System.out.print("--------------Invoke need Class--------------");
        try {
            NeedClass needClass = new NeedClass();
        } catch (Throwable e) {
            //TODO: handle exception
        }
    }
}