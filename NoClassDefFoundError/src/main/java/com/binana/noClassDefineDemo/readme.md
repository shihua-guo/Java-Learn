#### 说明
    模拟一个类初始化的时候出现异常，导致运行，调用该类的时候出现**NoClassDefFoundError**异常。
#### 编译
    javac -d ./target  -encoding utf-8 ./src/main/java/com/binana/noClassDefineDemo/*.java
#### 运行
    - 运行main
        java -cp ./target/ com.binana.noClassDefineDemo.Main
#### 结果

    ```bash
        ----------------第一个实例--------------------
        java.lang.ExceptionInInitializerError
        java.lang.NoClassDefFoundError: Could not initialize class com.binana.noClassDefineDemo.A
        ----------------第二个实例--------------------
        java.lang.ExceptionInInitializerError
        java.lang.NoClassDefFoundError: Could not initialize class com.binana.noClassDefineDemo.B
        ----------------第三个实例--------------------
        java.lang.ArithmeticException: / by zero
        java.lang.ArithmeticException: / by zero
    ```
#### 结论
    - 第一个实例
        - 第一次调用该类，类进行初始化成员变量。但是由于初始化变量的时候，出现了异常，所以抛出ExceptionInInitializerError。
        - 第二次调用该类，但是！因为之前初始化失败，所以第二次非常大的可能会继续初始化失败，JVM会放弃初始化，而抛出另外一个异常：**NoClassDefFoundError**
    - 第二个实例
        - 第一次调用该类，类进行初始化的时候执行静态代码块。但，出现了异常，所以抛出ExceptionInInitializerError。
        - 第二次调用该类，但是！因为之前初始化失败，所以第二次非常大的可能会继续初始化失败，JVM会放弃初始化，而抛出另外一个异常：**NoClassDefFoundError**
    - 第三个实例
        - 用于对照。构造器异常不属于初始化类。