#### 说明
    模拟一个类初始化的过程。
#### 编译
    javac -d ./target  -encoding utf-8 ./src/main/java/com/binana/classLoad/*.java
#### 运行
    - 运行main
        java -cp ./target/ com.binana.classLoad.Main
#### 结果

    ```bash
        --------------创建实例--------------------
        抽象类Abstract构造器前的静态代码块
        抽象类Abstract构造器之后的静态代码块
        实例类Instance构造器前的静态代码块
        实例类Instance构造器之后的静态代码块
        抽象类Abstract构造器前的代码块
        抽象类Abstract构造器之后的代码块
        抽象类Abstract构造器
        实例类Instance构造器前的代码块
        实例类Instance构造器之后的代码块
        实例类Instance构造器
        --------------完成创建第一个实例--------------------
        抽象类Abstract构造器前的代码块
        抽象类Abstract构造器之后的代码块
        抽象类Abstract构造器
        实例类Instance构造器前的代码块
        实例类Instance构造器之后的代码块
        实例类Instance构造器
        接口成员变量X中的动态代码块
        接口成员变量Y中的动态代码块
        --------------完成创建第二个实例--------------------
    ```
#### 结论
