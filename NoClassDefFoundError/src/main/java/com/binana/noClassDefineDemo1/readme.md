#### 说明
    模拟编译完成之后，删除FakeClass.class文件，之后的情况。
#### 编译
    javac -d ./target  -encoding utf-8 ./src/main/java/com/binana/noClassDefineDemo1/*.java
#### 运行
    - 删除FakeClass.class文件
        rm ./target/com/binana/noClassDefineDemo1/FakeClass.class 
    - 运行main
        java -cp ./target/ com.binana.noClassDefineDemo1.Main
#### 结果

    ```bash
        java.lang.NoClassDefFoundError: com/binana/noClassDefineDemo1/FakeClass
        at com.binana.noClassDefineDemo1.Main.main(Main.java:6)
        Caused by: java.lang.ClassNotFoundException: com.binana.noClassDefineDemo1.FakeClass
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 1 more
    ```