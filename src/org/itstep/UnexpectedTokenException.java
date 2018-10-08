package org.itstep;

public class UnexpectedTokenException extends Exception {
    private final Token tok;

    public UnexpectedTokenException(String message, Throwable cause, Token tok) {
        super(message, cause);
        this.tok = tok;
    }

    public UnexpectedTokenException(String message, Token tok) {
        super(message);
        this.tok = tok;
    }

    public UnexpectedTokenException(Token unexpected) {
        this.tok = unexpected;
    }

    public Token getToken() {
        return tok;
    }
}
