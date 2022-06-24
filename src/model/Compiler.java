package model;

import java_cup.runtime.Symbol;

import java.util.ArrayList;

public class Compiler {
    private final ArrayList<Symbol> tokens;
    private String parserOutput;

    private Compiler() {
        tokens = new ArrayList<>();
        parserOutput = "";
    }

    private static Compiler instance;

    public static Compiler getInstance() {
        if(instance == null) {
            instance = new Compiler();
        }
        return instance;
    }

    public ArrayList<Symbol> getTokens() {
        return tokens;
    }

    public void addToken(Symbol s) {
        tokens.add(s);
    }

    public void clearTokens() {
        tokens.clear();
    }

    public void clearParserOutput() {
        this.parserOutput = "";
    }

    public void appendToParserOutput(String parserOutput) {
        this.parserOutput += parserOutput;
    }

    public String getParserOutput() {
        return parserOutput;
    }
}
