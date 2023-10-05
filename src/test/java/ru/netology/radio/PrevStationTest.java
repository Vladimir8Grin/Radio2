package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrevStationTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setPrevStation(4);

        int expected = 3;
        int actual = radio.getPrevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setPrevStation(7);

        int expected = 6;
        int actual = radio.getPrevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setPrevStation(8);

        int expected = 7;
        int actual = radio.getPrevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setPrevStation(10);

        int expected = 0;
        int actual = radio.getPrevStation();
        Assertions.assertEquals(expected, actual);
    }

}
