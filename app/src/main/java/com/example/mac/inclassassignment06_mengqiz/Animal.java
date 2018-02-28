package com.example.mac.inclassassignment06_mengqiz;

import java.io.Serializable;


public class Animal implements Serializable{
    private String type;
    private int leg;
    private boolean hasFur;
    private String moreInfo;

    public Animal(String type, int leg, boolean hasFur, String moreInfo) {
        this.type = type;
        this.leg = leg;
        this.hasFur=hasFur;
        this.moreInfo=moreInfo;
    }
    public String getType() {
        return type;
    }

    public int getLeg() {
        return leg;
    }

    public boolean getBoolean() {
        return hasFur;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public String toString() {return "Animal Type: "+ type+ "\nNumber of legs :"+ leg+"\nHas Fur: "+hasFur+"\nMore Info: "+moreInfo;}
}
