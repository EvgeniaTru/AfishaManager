package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @Test
    public void shouldAdd() {
        FilmItem item = new FilmItem();
        manager.add(item);
        FilmItem [] expected = new FilmItem[] {item};
        assertArrayEquals(expected, manager.getAll());
    }

    @Test
    void getAll() {
    }
}