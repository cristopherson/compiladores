class Expression {
    private Integer integerValue;
    private Boolean booleanValue;
    private String stringValue;
    private CoolId coolIdValue;

    public void setInteger(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public void setBoolean(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public void setString(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setCoolId(CoolId coolIdValue) {
        this.coolIdValue = coolIdValue;
    }

    public Integer getInteger() {
        return this.integerValue;
    }

    public Boolean getBoolean() {
        return this.booleanValue;
    }

    public String getString() {
        return this.stringValue;
    }

    public CoolId getCoolId() {
        return this.coolIdValue;
    }

    public void printExpression() {
        System.out.println("str = " + stringValue + ", int = " + integerValue + ", bool = " + booleanValue);
    }
}
