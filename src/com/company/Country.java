package com.company;

public class Country {

    private String country;

    private String adres;

    public Country(String counter, String adres) {
        this.country = counter;
        this.adres = adres;
    }

    public String getCounter() {
        return country;
    }

    public String getAdres() {
        return adres;
    }
}
