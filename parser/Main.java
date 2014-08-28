import java.io.*;
import java_cup.runtime.Symbol;

class Main {

    public static void main(String args[]) throws java.io.IOException {
        CoolScanner scanner = new CoolScanner( new FileInputStream(args[0]));
        scanner.setCurrentFileName(args[0]);
        CoolParser parser = new CoolParser(scanner);
        Program program = null;

        try {
            program = ((Program)parser.parse().value);
            //program.printTree();
            //program.printProgram();
            System.out.println("Parsing operation succesfull for '" + args[0] + "' file");
        } catch(Exception e) {
           System.out.println("Parsing operation has failed ");
        }
    }
}
