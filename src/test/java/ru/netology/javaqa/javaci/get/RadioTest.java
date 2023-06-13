package ru.netology.javaqa.javaci.get;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        //System.out.println(radio.getCurrentStation());
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldUnderMinSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        //System.out.println(radio.getCurrentStation());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldOverMaxSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        //System.out.println(radio.getCurrentStation());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualsMinSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        //System.out.println(radio.getCurrentStation());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualsMaxSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        //System.out.println(radio.getCurrentStation());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(55);

        int expected = 56;
        int actual = radio.getCurrentVolume();

        //System.out.println(radio.getCurrentVolume());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldUnderMinVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        //System.out.println(radio.getCurrentVolume());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldOverMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(110);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        //System.out.println(radio.getCurrentVolume());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualsMinVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(0);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        //System.out.println(radio.getCurrentVolume());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualsMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(99);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        //System.out.println(radio.getCurrentVolume());
        Assertions.assertEquals(expected, actual);

    }

}
