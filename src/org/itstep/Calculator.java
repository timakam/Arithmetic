package org.itstep;

import java.nio.CharBuffer;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String expressionString = sc.nextLine();

            System.out.println(
                    SyntaxParser.parseExpression(
                            LexicalParser.lexicalParserRec(CharBuffer.wrap(expressionString),new LinkedList<>())
                    )
            );

        } catch (UnknownLexicalSequenceException e) {
            System.out.println("Unknown lexical sequence near: " + e.getExpression().charAt(0));
        } catch (UnexpectedTokenException e) {
            System.out.println("Unexpected token: " + e.getToken());
        } catch (UnexpectedEndOfExpressionException e) {
            System.out.println("Unexpected end of the expression near: " + e.getToken());
        }
    }
}
