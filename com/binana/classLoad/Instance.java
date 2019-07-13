package com.binana.classLoad;
import static com.binana.classLoad.Println.println;
import com.binana.classLoad.FakeClass;
public class Instance extends Abstract{
    static {
        println("实例类Instance构造器前的静态代码块");
        FakeClass.test("test");
    }
    {
        println("实例类Instance构造器前的代码块");
    }
    public Instance(){
        println("实例类Instance构造器");
    }
    static {
        println("实例类Instance构造器之后的静态代码块");
    }
    {
        println("实例类Instance构造器之后的代码块");
    }
}