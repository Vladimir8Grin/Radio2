package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrevStationTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setRadioStation(2);
        radio.prevStation();

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}