package com.company;

public final class Toyota extends BMW {

    public Toyota(String counter, String adres, int age, Color color) {
        super(counter, adres, age, color);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public void makeVois() {
        System.out.println("Бибиип, Бибииип");
    }
    public void makeVois(String vois) {
        System.out.println(vois);

    }

}
