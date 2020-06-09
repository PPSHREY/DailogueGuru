package com.example.shreypatel.dailogueguru;

import android.widget.Button;

public class ListProfile {


    private String txt1,text;


    public ListProfile(String txt1, String text) {
        this.txt1 = txt1;
        this.text = text;

    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String username) {
        this.txt1 = txt1;
    }


    public String getText() {
        return text;
    }

    public void setText(String username) {
        this.text = text;
    }


}


