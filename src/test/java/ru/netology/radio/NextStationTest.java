package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextStationTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setNextStation(5);

        int expected = 4;
        int actual = radio.getNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setNextStation(7);

        int expected = 8;
        int actual = radio.getNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setNextStation(8);

        int expected = 9;
        int actual = radio.getNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setNextStation(9);

        int expected = 0;
        int actual = radio.getNextStation();
        Assertions.assertEquals(expected, actual);
    }

}