package com.binana.noClassDefineDemo2;
public class Main {
    public static void main(String[] args) {
        try {
            A a = new A();
        } catch (Throwable e) {
            //TODO: handle exception
            System.out.print(e);
        }
    }
}