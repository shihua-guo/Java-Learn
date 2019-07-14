#### 说明
    模拟一个类初始化的时候出现异常，导致运行，调用该类的时候出现**NoClassDefFoundError**异常。
#### 编译
    javac -d ./target  -encoding utf-8 ./src/main/java/com/binana/noClassDefineDemo/*.java
#### 运行
    - 运行main
        java -cp ./target/ com.binana.noClassDefineDemo.Main
#### 结果

    ```bash
        java.lang.ExceptionInInitializerError
        Exception in thread "main" java.lang.NoClassDefFoundError: Could not initialize class com.binana.noClassDefineDemo.SimpleCalculator
        at com.binana.noClassDefineDemo.Main.main(Main.java:11)
    ```