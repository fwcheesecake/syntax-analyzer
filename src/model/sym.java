
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package model;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int SHORT = 16;
  public static final int BITWISE_XOR = 75;
  public static final int LEFT = 88;
  public static final int IDENTIFIER = 101;
  public static final int TIMES = 58;
  public static final int IMPLEMENTS = 33;
  public static final int MODULE_ASSIGNMENT = 81;
  public static final int PLUS_ASSIGNMENT = 77;
  public static final int STRICTFP = 31;
  public static final int RIGHT = 89;
  public static final int RIGHTSHIFT = 71;
  public static final int BITWISE_OR = 73;
  public static final int ASSIGNMENT = 76;
  public static final int ENUM = 27;
  public static final int COMMA = 97;
  public static final int CATCH = 37;
  public static final int THROW = 39;
  public static final int BITWISE_XOR_ASSIGNMENT = 85;
  public static final int INCREMENT = 51;
  public static final int DOUBLE = 20;
  public static final int TRANSIENT = 44;
  public static final int MINUS_ASSIGNMENT = 78;
  public static final int LOGICAL_OR = 54;
  public static final int PROTECTED = 48;
  public static final int INTEGER_LITERAL = 99;
  public static final int LEFT_CURLY = 90;
  public static final int DIFFERENT = 66;
  public static final int ERROR = 102;
  public static final int FINAL = 13;
  public static final int BITWISE_NOT = 69;
  public static final int FLOAT = 19;
  public static final int PACKAGE = 49;
  public static final int QUOTES = 67;
  public static final int BITWISE_NOT_ASSIGNMENT = 82;
  public static final int BOOLEAN_LITERAL = 98;
  public static final int RIGHTSHIFT_ASSIGNMENT = 87;
  public static final int LOGICAL_AND = 53;
  public static final int CLASS = 23;
  public static final int SUPER = 36;
  public static final int ABSTRACT = 34;
  public static final int NATIVE = 29;
  public static final int LONG = 18;
  public static final int PLUS = 56;
  public static final int DOUBLE_RIGHTSHIFT = 72;
  public static final int DIVIDE = 59;
  public static final int BITWISE_AND_ASSIGNMENT = 84;
  public static final int WHILE = 7;
  public static final int EXTENDS = 35;
  public static final int MODULE = 60;
  public static final int INTERFACE = 32;
  public static final int CHAR = 22;
  public static final int DIVIDE_ASSIGNMENT = 80;
  public static final int BOOLEAN = 14;
  public static final int SMALLER_EQUALS = 63;
  public static final int SWITCH = 4;
  public static final int DO = 8;
  public static final int LEFTSHIFT = 70;
  public static final int FOR = 9;
  public static final int GREATER_EQUALS = 62;
  public static final int GREATER = 64;
  public static final int VOID = 30;
  public static final int PUBLIC = 47;
  public static final int RETURN = 12;
  public static final int ELSE = 3;
  public static final int TRY = 41;
  public static final int BREAK = 10;
  public static final int DOT = 96;
  public static final int INTERROGATION = 68;
  public static final int INT = 17;
  public static final int THROWS = 40;
  public static final int NULL_LITERAL = 45;
  public static final int STRING_LITERAL = 104;
  public static final int SEMICOLON = 94;
  public static final int EOF = 0;
  public static final int LEFT_BRACKET = 92;
  public static final int THIS = 24;
  public static final int DEFAULT = 6;
  public static final int BITWISE_OR_ASSIGNMENT = 83;
  public static final int DECREMENT = 52;
  public static final int IMPORT = 50;
  public static final int LEFTSHIFT_ASSIGNMENT = 86;
  public static final int MINUS = 57;
  public static final int TIMES_ASSIGNMENT = 79;
  public static final int error = 1;
  public static final int LOGICAL_NOT = 55;
  public static final int SYNCHRONIZED = 42;
  public static final int FINALLY = 38;
  public static final int CONTINUE = 11;
  public static final int RIGHT_BRACKET = 93;
  public static final int IF = 2;
  public static final int COLON = 95;
  public static final int ASSERT = 28;
  public static final int CHARACTER_LITERAL = 103;
  public static final int VOLATILE = 43;
  public static final int CASE = 5;
  public static final int NEW = 26;
  public static final int RIGHT_CURLY = 91;
  public static final int STRING = 21;
  public static final int SMALLER = 65;
  public static final int BYTE = 15;
  public static final int PRIVATE = 46;
  public static final int STATIC = 25;
  public static final int BITWISE_AND = 74;
  public static final int EQUALS = 61;
  public static final int FLOATING_POINT_LITERAL = 100;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "IF",
  "ELSE",
  "SWITCH",
  "CASE",
  "DEFAULT",
  "WHILE",
  "DO",
  "FOR",
  "BREAK",
  "CONTINUE",
  "RETURN",
  "FINAL",
  "BOOLEAN",
  "BYTE",
  "SHORT",
  "INT",
  "LONG",
  "FLOAT",
  "DOUBLE",
  "STRING",
  "CHAR",
  "CLASS",
  "THIS",
  "STATIC",
  "NEW",
  "ENUM",
  "ASSERT",
  "NATIVE",
  "VOID",
  "STRICTFP",
  "INTERFACE",
  "IMPLEMENTS",
  "ABSTRACT",
  "EXTENDS",
  "SUPER",
  "CATCH",
  "FINALLY",
  "THROW",
  "THROWS",
  "TRY",
  "SYNCHRONIZED",
  "VOLATILE",
  "TRANSIENT",
  "NULL_LITERAL",
  "PRIVATE",
  "PUBLIC",
  "PROTECTED",
  "PACKAGE",
  "IMPORT",
  "INCREMENT",
  "DECREMENT",
  "LOGICAL_AND",
  "LOGICAL_OR",
  "LOGICAL_NOT",
  "PLUS",
  "MINUS",
  "TIMES",
  "DIVIDE",
  "MODULE",
  "EQUALS",
  "GREATER_EQUALS",
  "SMALLER_EQUALS",
  "GREATER",
  "SMALLER",
  "DIFFERENT",
  "QUOTES",
  "INTERROGATION",
  "BITWISE_NOT",
  "LEFTSHIFT",
  "RIGHTSHIFT",
  "DOUBLE_RIGHTSHIFT",
  "BITWISE_OR",
  "BITWISE_AND",
  "BITWISE_XOR",
  "ASSIGNMENT",
  "PLUS_ASSIGNMENT",
  "MINUS_ASSIGNMENT",
  "TIMES_ASSIGNMENT",
  "DIVIDE_ASSIGNMENT",
  "MODULE_ASSIGNMENT",
  "BITWISE_NOT_ASSIGNMENT",
  "BITWISE_OR_ASSIGNMENT",
  "BITWISE_AND_ASSIGNMENT",
  "BITWISE_XOR_ASSIGNMENT",
  "LEFTSHIFT_ASSIGNMENT",
  "RIGHTSHIFT_ASSIGNMENT",
  "LEFT",
  "RIGHT",
  "LEFT_CURLY",
  "RIGHT_CURLY",
  "LEFT_BRACKET",
  "RIGHT_BRACKET",
  "SEMICOLON",
  "COLON",
  "DOT",
  "COMMA",
  "BOOLEAN_LITERAL",
  "INTEGER_LITERAL",
  "FLOATING_POINT_LITERAL",
  "IDENTIFIER",
  "ERROR",
  "CHARACTER_LITERAL",
  "STRING_LITERAL"
  };
}

