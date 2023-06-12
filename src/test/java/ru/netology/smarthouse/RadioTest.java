package ru.netology.smarthouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {       //проверяем, может ли радио выставить допустимый номер станции
        Radio station = new Radio();

        station.setCurrentStation(4);

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetBigNumber() { //проверяем, может ли радио выставить НЕдопустимый номер станции больше 9
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetLessNumber() { //проверяем, может ли радио выставить НЕдопустимый номер станции меньше 0
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {          //проверка выставления минимальной станции
        Radio station = new Radio();

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxStation() {          //проверка выставления максимальной станции
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {        //должен устанавливать следующую станцию
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.next();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation0() {        //должен устанавливать следующую станцию, если больше 9, то 0
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {        //должен устанавливать следующую станцию вниз
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prev();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation0() {        //должен устанавливать 9 станцию, если меньше 0
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    //ГРОМКОСТЬ

    @Test
    public void shouldSetMinVolume() {          //проверка установления минимальной громкости

        Radio station = new Radio();

        station.setVolume(0);

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {          //проверка установления максимальной громкости
        Radio station = new Radio();

        station.setVolume(10);

        int expected = 10;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetBigVolume() {          //проверка установления громкости больше максимального 10
        Radio station = new Radio();

        station.setVolume(10);
        station.volumeUp();

        int expected = 10;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxLimitVolume() {         //должен устанавливать значение громкости не более 10
        Radio station = new Radio();

        station.setVolume(11);

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {         //должен устанавливать следующее значение громкости
        Radio station = new Radio();

        station.setVolume(9);
        station.volumeUp();

        int expected = 10;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinLimitVolume() {     //должен устанавливать значение громкости не менее 0
        Radio station = new Radio();

        station.setVolume(-1);
        station.volumeDown();

        int expected = 0;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolume() {     //должен устанавливать предыдущее значение громкости
        Radio station = new Radio();

        station.setVolume(10);
        station.volumeDown();

        int expected = 9;
        int actual = station.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


