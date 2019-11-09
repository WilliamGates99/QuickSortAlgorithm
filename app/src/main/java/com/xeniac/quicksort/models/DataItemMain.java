package com.xeniac.quicksort.models;

public class DataItemMain {

    private int number;

    public DataItemMain() {
    }

    public DataItemMain(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DataItemMain{" +
                "number=" + number +
                '}';
    }
}