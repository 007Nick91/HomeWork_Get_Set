package ru.netology.javaqa.javaci.get;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationFirst() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldSetToMaxStation() {
        Radio rad = new Radio();

        rad.setToMaxStat();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(11);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldSetToMinStation() {
        Radio rad = new Radio();

        rad.setToMinStat();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMinStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();
        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.prevStation();
        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    // Для второго задания
    @Test
    public void shouldSetVolumeFirst() {
        Radio rad = new Radio();

        rad.setCurrentVolume(55);

        int expected = 55;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldSetToMaxVolume() {
        Radio rad = new Radio();

        rad.setToMaxVol();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(110);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldSetToMinVolume() {
        Radio rad = new Radio();

        rad.setToMinVol();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMinSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(55);

        rad.increaseVolume();
        int expected = 56;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldOverIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(110);

        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(55);

        rad.reduceVolume();
        int expected = 54;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEqualReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldUnderReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}

