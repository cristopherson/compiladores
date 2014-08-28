import java.io.*;

class Main {

    public static void main(String args[]) throws java.io.IOException {
        Yylex lex = new Yylex( new FileInputStream(args[0]));
        Token result = lex.yylex();

        while ( result != null ) {
            System.out.println("(" + result.getType() + ") " + result.getToken());
            result = lex.yylex(); //get next token
        }
    }
}
