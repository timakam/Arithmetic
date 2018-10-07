package org.itstep;

public class UnknownLexicalSequenceException extends Exception {
    private final CharSequence expression;

    public UnknownLexicalSequenceException(CharSequence expression, String message, Throwable cause) {
        super(message, cause);
        this.expression = expression;
    }

    public UnknownLexicalSequenceException(String message, CharSequence expression) {
        super(message);
        this.expression = expression;
    }

    public UnknownLexicalSequenceException(CharSequence expression) {
        this.expression = expression;
    }

    public CharSequence getExpression() {
        return expression;
    }
}
