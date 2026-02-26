Simple Java Lexer (Lexical Analyzer)
Overview

This project implements a simple Lexical Analyzer (Lexer) in Java.
The program reads source code as input and breaks it into meaningful tokens such as keywords, identifiers, numbers, operators, and symbols.

It represents the first phase of compiler design: Lexical Analysis.

What is Lexical Analysis?

Lexical Analysis is the process of converting raw source code into a sequence of tokens.
These tokens are later used by the parser in the next phase of a compiler.

Example Input
int x = 10 + 5; if (x > 5) return;
Example Output
KEYWORD: int
IDENTIFIER: x
OPERATOR: =
NUMBER: 10
OPERATOR: +
NUMBER: 5
SYMBOL: ;
KEYWORD: if
SYMBOL: (
IDENTIFIER: x
OPERATOR: >
NUMBER: 5
SYMBOL: )
KEYWORD: return
SYMBOL: ;
Features

Recognizes keywords: int, float, if, else, return, while

Recognizes identifiers (variable names)

Recognizes numeric literals

Recognizes operators (+ - * / = > < !)

Recognizes symbols (() {} , ;)

Ignores whitespace

Uses Regular Expressions (Regex)

Console-based user input

Project Structure
compiler_lec1
│
├── Main.java      // Entry point
├── Lexer.java     // Tokenization logic
└── Token.java     // Token representation
How to Run

Open the project in Eclipse or any Java IDE.

Run Main.java.

Enter your code in the console.

The program will display the generated tokens.

Technologies Used

Java

Regular Expressions (java.util.regex)

Object-Oriented Programming (OOP)

Educational Purpose

This project was created as part of a Compiler Design course to demonstrate:

Tokenization

Pattern matching using Regex

Basic compiler architecture
