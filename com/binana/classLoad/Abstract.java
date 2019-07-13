package com.binana.classLoad;
import static com.binana.classLoad.Println.println;
public class Abstract implements Interface{
    static {
        println("抽象类Abstract构造器前的静态代码块");
    }
    {
        println("抽象类Abstract构造器前的代码块");
    }
    public Abstract(){
        println("抽象类Abstract构造器");
    }
    static {
        println("抽象类Abstract构造器之后的静态代码块");
    }
    {
        println("抽象类Abstract构造器之后的代码块");
    }
}