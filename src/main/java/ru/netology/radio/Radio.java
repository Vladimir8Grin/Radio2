package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int radioVol;
    private int stationMax;
    private int volMax;

    public Radio() {
        this.stationMax = 9;
        this.volMax = 99;
    }

    public Radio(int StationAndVol) {
        this.stationMax = StationAndVol - 1;
        this.volMax = StationAndVol - 1;
    }

    public void prevStation() {
        if (radioStation != 0) {
            radioStation--;
            return;
        }
        radioStation = stationMax;
    }

    public void nextStation() {
        if (radioStation != stationMax) {
            radioStation++;
            return;
        }
        radioStation = 0;

    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {

        if (radioStation < 0) {
            return;
        }
        if (radioStation > stationMax) {
            return;
        }
        this.radioStation = radioStation;

    }

    public int getRadioVol() {
        return radioVol;
    }

    public void setRadioVol(int radioVol) {
        if (radioVol < 0) {
            return;
        }
        if (radioVol > volMax) {
            return;
        }
        this.radioVol = radioVol;
    }
}


