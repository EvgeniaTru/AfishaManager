package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class AfishaManager {

    int addedFilmsToAfisha = 10;
    private FilmItem[] items = new FilmItem[0];

    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getAll() {
        FilmItem[] result = new FilmItem[items.length];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }
        return result;
    }

    public FilmItem[] showLastFilms(int addedFilmsToAfisha) {
        FilmItem[] afisha = new FilmItem[addedFilmsToAfisha];
        for (int i = 0; i < addedFilmsToAfisha; i++) {
            afisha[i] = items[i];

        }
        return afisha;
    }
}
