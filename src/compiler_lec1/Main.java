package compiler_lec1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your code:");
        String code = scanner.nextLine();  // بياخد سطر واحد من المستخدم

        Lexer lexer = new Lexer();
          List<Token> tokens = lexer.tokenize(code);

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}