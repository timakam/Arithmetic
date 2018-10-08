package org.itstep;

public class UnexpectedEndOfExpressionException extends Exception {
    private final CharSequence rest;

    public UnexpectedEndOfExpressionException(CharSequence rest, Throwable cause, String message ) {
        super(message, cause);
        this.rest = rest;
    }

    public UnexpectedEndOfExpressionException(CharSequence rest, String message) {
        super(message);
        this.rest = rest;
    }

    public UnexpectedEndOfExpressionException(CharSequence rest) {
        this.rest = rest;
    }

    public CharSequence getExpression() {
        return rest;
    }
}
