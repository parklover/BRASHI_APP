package com.example.brashi;

public class Dzielo {

    private String name;
    private String author;
    private String date_create;

    public Dzielo(String name, String author, String date_create) {
        this.name=name;
        this.author=author;
        this.date_create=date_create;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDateCreate() {
        return date_create;
    }
}
