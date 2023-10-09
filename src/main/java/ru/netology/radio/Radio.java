package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int radioVol;

    public void prevStation() {
        if (radioStation != 0) {
            radioStation--;
            return;
        }
        radioStation = 9;
    }


    public void nextStation() {
        if (radioStation != 9) {
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


