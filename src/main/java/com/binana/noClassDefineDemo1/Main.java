package com.binana.noClassDefineDemo1;
import static com.binana.noClassDefineDemo1.FakeClass.test;
public class Main{
    public static void main(String[] args){
        try{
            test();
        }catch(Throwable e){
            System.out.print("截获异常");
            e.printStackTrace();
        }
    }
}