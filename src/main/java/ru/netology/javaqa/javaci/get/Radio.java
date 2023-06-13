package ru.netology.javaqa.javaci.get;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            currentStation = 9;
        }
        if (newCurrentStation > 0){
            currentStation = newCurrentStation;
        }


    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void increaseVolume(int newIncVolume) {
        if (newIncVolume < 0) {
            return;
        }

        if (newIncVolume > 100) {
            currentVolume = 100;}


        if (newIncVolume < 100) {
            currentVolume = newIncVolume + 1;
        }


    }
}
