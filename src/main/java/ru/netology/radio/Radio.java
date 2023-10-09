package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int radioVol;

    public void prevStation() {
        if (this.radioStation == 0) {
            this.radioStation = 9;
        } else {
            this.radioStation--;
        }
    }

    public void nextStation() {
        if (this.radioStation == 9) {
            this.radioStation = 0;
        } else {
            this.radioStation++;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {

        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
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
        if (radioVol > 100) {
            return;
        }
        if (radioVol < 100) {

        }
        this.radioVol = radioVol;
    }
}


