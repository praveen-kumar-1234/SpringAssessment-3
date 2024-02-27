package com.praveen.model;

public class StringCompress {

    private String input;

    public StringCompress() {
    }

    public StringCompress(String input) {
        this.input = input;
    }


    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "StringCompress{" +
                "input=" + input +
                '}';
    }
}
