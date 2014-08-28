rm *.class
[ ! -f Token.class ] || javac Token.java
[ ! -f Expression.class ] || javac Expression.java
java java_cup.Main -parser CoolParser < cool.cup
javac CoolParser.java
jlex CoolScanner
javac CoolScanner.java 
javac Main.java 
for i in `find examples/ -name "*.cl"`;
do
    java Main $i;
done
