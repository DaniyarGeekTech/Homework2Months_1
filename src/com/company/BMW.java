package com.company;

public class BMW extends Country {

    private int age;

    private  Color color;

    public BMW(String counter, String adres, int age, Color color) {
        super(counter, adres);
        this.age = age;
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }


    public String getInfo() {
        return "\nвозрост: " + age +
                "\nцвет: " + color +
                "\nадрес: " + getCounter() +
                "\nстрана: " + getAdres();
    }
    public void makeVois() {
        System.out.println("Бибиип, Бибииип");
    }
    public void makeVois(String vois) {
        System.out.println(vois);

    }
}
