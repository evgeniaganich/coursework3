package com.example.coursework3.model;

public enum Size {
    SMALL ("34-37"), MEDIUM ("38-41"), LARGE("42-46");

    private final String text;

    Size(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
