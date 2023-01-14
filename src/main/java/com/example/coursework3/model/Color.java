package com.example.coursework3.model;

public enum Color {
    RED("красный"), ORANGE("оранжевый"), YELLOW("желтый"), PINK("розовый"), GREEN("зеленый"), BLUE ("голубой"),
    VIOLET("фиолетовый"), WHITE("белый"), BLACK("черный"), BROWN("коричневый");

    private final String text;

    Color(String text) {
        this.text = text;
    }
}
