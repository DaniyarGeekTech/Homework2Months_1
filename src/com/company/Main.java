package com.company;

public class Main {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes( " Germany ", " Hamburg ",15,Color.BLUE);
        System.out.println(mercedes.getInfo());
        mercedes.makeVois();
        mercedes.makeVois("Пибииип, Пибииип");

        System.out.println("-------------------");

        System.out.println("********=********");
        Toyota toyota = new Toyota("Japan","Токио",3,Color.BROWN);
        System.out.println(toyota.getInfo());
        toyota.makeVois();
        toyota.makeVois("пип пип");

        System.out.println("-------------------");

        BMW bmw =new BMW(" Germany " ," Hamburg ", 12 ,Color.BLEK );
        System.out.println(bmw.getInfo());
        bmw.makeVois();
        bmw.makeVois("врр врр ");

    }
}
