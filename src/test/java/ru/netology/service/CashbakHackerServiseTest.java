package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbakHackerServiseTest {

    @Test
    void shouldNotRemainBoundary() {
        //подготовка
        CashbakHackerServise cashbakHackerServise = new CashbakHackerServise();
        int amount = 1000;

        //выполнение действия
        int actual = cashbakHackerServise.remain(amount);
        int expected = 0;

        //сраснение результата
        assertEquals(expected, actual);

    }
    void shouldNotRemainBoundary2() {
        //подготовка
        CashbakHackerServise cashbakHackerServise = new CashbakHackerServise();
        int amount = 2000;

        //выполнение действия
        int actual = cashbakHackerServise.remain(amount);
        int expected = 1000;

        //сраснение результата
        assertEquals(expected, actual);

    }
}