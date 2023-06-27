package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String furResult = "";
        String pawResult = "";
        String phrase = "";

        if (this.hasFur) {
            furResult = "a";
        } else {
            furResult = "no";
        }

        if (this.numberOfPaws == 1) {
            pawResult = "paw";
        } else {
            pawResult = "paws";
        }

        phrase = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" " +pawResult+ " and "+ furResult +" fur.";

        return phrase;
    }
}
