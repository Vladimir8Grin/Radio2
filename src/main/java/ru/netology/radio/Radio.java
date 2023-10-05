package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int radioVol;
    private int nextStation;
    private int prevStation;

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (radioStation != 8) {
            radioStation--;
        } else {
            radioStation = 9;
        }
        this.prevStation = prevStation;
    }

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
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


