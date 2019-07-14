package com.binana.noClassDefineDemo;
public class Main {
    public static void main(String[] args) {
        instanceA();
        instanceB();
        instanceC();
    }
    public static void instanceA(){
        System.out.println("----------------第一个实例--------------------");
        try {
            // The following line would throw ExceptionInInitializerError
            A a = new A();
        } catch (Throwable t) {
            System.out.println(t);
        }
        try {
            // The following line would cause NoClassDefFoundError
            A a2 = new A();
        } catch (Throwable t) {
            System.out.println(t);
        }

    }
    public static void instanceB(){
        System.out.println("----------------第二个实例--------------------");
        try {
            // The following line would throw ExceptionInInitializerError
            B b = new B();
        } catch (Throwable t) {
            System.out.println(t);
        }
        try {
            // The following line would cause NoClassDefFoundError
            B b2 = new B();
        } catch (Throwable t) {
            System.out.println(t);
        }

    }
    public static void instanceC(){
        System.out.println("----------------第三个实例--------------------");
        try {
            // The following line would throw ExceptionInInitializerError
            C c = new C();
        } catch (Throwable t) {
            System.out.println(t);
        }
        try {
            // The following line would cause NoClassDefFoundError
            C c2 = new C();
        } catch (Throwable t) {
            System.out.println(t);
        }

    }

}