package ru.netology.domain;


public class Movies {
    private int id;
    private String filmName;
    private String filmGenre;
    private boolean premiereTomarrov;

    public Movies(int id, String filmName, String filmGenre, boolean premiereTomarrov) {
        this.id = id;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.premiereTomarrov = premiereTomarrov;
    }
}
