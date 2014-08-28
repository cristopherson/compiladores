import java.util.List;
import java.util.ArrayList;

class Program {
    private List<Token> tokenList;
    private Expression expression;

    public Program() {
        expression = new Expression();
        tokenList = new ArrayList<Token>();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setTokenList(List<Token> tokenList) {
        this.tokenList = tokenList;
    }

    public void printProgram() {
        expression.printExpression();
    }

    public void printTree() {
        for(Token token:tokenList) {
            System.out.println(token.getType());
        }
    }
}
