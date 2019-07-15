javac -d ../../../../../../target  -encoding utf-8 ./*.java
cd ../../../../../../target/com/binana/noClassDefineDemo1/FakeClass.class
del ./FakeClass.class
java -cp ../../../../../../target/ com.binana.noClassDefineDemo1.Main
pause