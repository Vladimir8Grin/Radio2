package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationTest {

    @Test
    public void test() {
        Radio radio = new Radio(10);
        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio(10);
        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio(10);
        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio(10);
        radio.setRadioStation(11);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio(10);
        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio(10);
        radio.setRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test7() {
        Radio radio = new Radio(10);
        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}