package org.itstep;

public class UnexpectedEndOfExpressionException extends Exception {
    private final Token nextToken;

    public UnexpectedEndOfExpressionException(Token nextToken, Throwable cause, String message ) {
        super(message, cause);
        this.nextToken = nextToken;
    }

    public UnexpectedEndOfExpressionException(Token nextToken, String message) {
        super(message);
        this.nextToken = nextToken;
    }

    public UnexpectedEndOfExpressionException(Token nextToken) {
        this.nextToken = nextToken;
    }

    public Token getExpression() {
        return nextToken;
    }
}
