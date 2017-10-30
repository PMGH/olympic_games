package com.example.peter.theolympics;

/**
 * Created by Peter on 30/10/2017.
 */

public enum Medal {

    GOLD(15, "Gold"),
    SILVER(10, "Silver"),
    BRONZE(5, "Bronze");

    private int value;
    private String medalName;

    Medal(int value, String medalName) {
        this.value = value;
        this.medalName = medalName;
    }

    public int getValue() {
        return value;
    }

    public String getMedalName(){
        return medalName;
    }

}
// this