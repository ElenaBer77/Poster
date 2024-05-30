package ru.netology.manager;

import ru.netology.domain.Movies;

public class MoviesManager {
    private int limit;
    private String[] items = new String[0];

    public MoviesManager() {
        this.limit = 5;
    }

    public MoviesManager(int limit) {
        this.limit = limit;

    }

    public void addFilm(String item) {   //добавление нового фильма
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }

}


