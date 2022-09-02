package com.company;

public class Mercedes extends BMW {

    public Mercedes(String counter, String adres, int age, Color color) {
        super(counter, adres, age, color);
    }

    public void makeVois() {
        System.out.println("Бибиип, Бибииип");
    }
    public void makeVois(String vois) {
        System.out.println(vois);

    }
}
