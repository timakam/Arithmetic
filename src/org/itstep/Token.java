package org.itstep;

public final class Token {
    public final TokenType tokType;
    public final CharSequence data;

    public Token(TokenType tokType, CharSequence data) {
        this.tokType = tokType;
        this.data    = data;
    }

    @Override
    public String toString() {
        return "{"+tokType.toString()+","+data.toString()+"}";
    }
}
