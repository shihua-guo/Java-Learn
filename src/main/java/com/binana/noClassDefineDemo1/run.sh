javac -d ../../../../../../target  -encoding utf-8 ./*.java
rm ../../../../../../target/com/binana/noClassDefineDemo1/FakeClass.class
java -cp ../../../../../../target/ com.binana.noClassDefineDemo1.Main
echo 按任意键继续
read -n 1