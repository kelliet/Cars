package com.company;

public class Main {

    public static void main(String[] args) {

        Corvette c = new Corvette();
        Duramax d = new Duramax();

        System.out.println( c.getMaxSpeed() + " " + d.getMaxSpeed());
    }
}
