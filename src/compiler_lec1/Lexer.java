package compiler_lec1;

import java.util.*;
import java.util.regex.*;

class Lexer {

    private static final String TOKEN_PATTERNS =
        "(?<KEYWORD>\\b(int|float|if|else|return|while)\\b)|" +
        "(?<NUMBER>\\b\\d+\\b)|" +
        "(?<IDENTIFIER>\\b[a-zA-Z_][a-zA-Z0-9_]*\\b)|" +
        "(?<OPERATOR>[+\\-*/=<>!]+)|" +
        "(?<SYMBOL>[(){},;])|" +
        "(?<WHITESPACE>[ \\t\\r\\n]+)";

    public List<Token> tokenize(String input) {

        List<Token> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile(TOKEN_PATTERNS);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            if (matcher.group("WHITESPACE") != null)
                continue;

            if (matcher.group("KEYWORD") != null) {
                tokens.add(new Token("KEYWORD", matcher.group("KEYWORD")));

            } else if (matcher.group("NUMBER") != null) {
                tokens.add(new Token("NUMBER", matcher.group("NUMBER")));

            } else if (matcher.group("IDENTIFIER") != null) {
                tokens.add(new Token("IDENTIFIER", matcher.group("IDENTIFIER")));

            } else if (matcher.group("OPERATOR") != null) {
                tokens.add(new Token("OPERATOR", matcher.group("OPERATOR")));

            } else if (matcher.group("SYMBOL") != null) {
                tokens.add(new Token("SYMBOL", matcher.group("SYMBOL")));
            }
        }

        return tokens;
    }
}