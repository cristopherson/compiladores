jlex cool-lex 
javac cool-lex.java 
javac Main.java 
for i in `find examples/ -name "*.cl"`;
do
    java Main $i 1>$i.txt;
done
