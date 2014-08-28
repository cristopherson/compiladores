class Token {
    private String token;
    private String type;
    public static String CASE = "CASE";
    public static String CLASS = "CLASS";
    public static String ELSE = "ELSE";
    public static String ESAC = "ESAC";
    public static String FI = "FI";
    public static String IF = "IF";
    public static String IN = "IN";
    public static String INHERITS = "INHERITS";
    public static String ISVOID = "ISVOID";
    public static String LET = "LET";
    public static String LOOP = "LOOP";
    public static String NEW = "NEW";
    public static String NOT = "NOT";
    public static String OF = "OF";
    public static String POOL = "POOL";
    public static String THEN = "THEN";
    public static String WHILE = "WHILE";
    public static String PLUS = "PLUS";
    public static String MINUS = "MINUS";
    public static String EQ = "EQ";
    public static String DIV = "DIV";
    public static String LT = "LT";
    public static String DOT = "DOT";
    public static String NEG = "NEG";
    public static String COMMA = "COMMA";
    public static String SEMI = "SEMI";
    public static String COLON = "COLON";
    public static String RPAREN = "RPAREN";
    public static String AT = "AT";
    public static String LBRACE = "LBRACE";
    public static String RBRACE = "RBRACE";
    public static String MULT = "MULT";
    public static String LPAREN = "RPAREN";
    public static String ASSIGN = "DASSIGN";
    public static String DARROW = "DARROW";
    public static String INT_CONST = "INT_CONST";
    public static String STR_CONST = "STR_CONST";
    public static String BOOL_CONST = "BOOL_CONST";
    public static String TYPEID = "TYPEID";
    public static String OBJECTID = "OBJECTID";
    public static String ERROR = "ERROR";
    public static String COMMENT = "COMMENT";
    public static String SCAPED = "SCAPED";

    public Token(String token, String type) {
        this.token = token;
        this.type = type;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Boolean parseBoolean() {
        return Boolean.parseBoolean(token);
    }

    public Integer parseInt() {
        return Integer.parseInt(token);
    }

    public String parseStr() {
        return token;
    }

    public CoolId parseCoolId() {
        CoolId coolId = new CoolId();
        coolId.setName(token);
        return coolId;
    }

}
