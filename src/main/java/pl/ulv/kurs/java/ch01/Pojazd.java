package pl.ulv.kurs.java.ch01;

import java.util.Random;

public class Pojazd {

    static int NUM_OF_WHEELS = 4;

    private String color;
    private int maxSpeed;
    private int price;
    private short waga;
    private boolean czyMaSzyberdach;

    public Pojazd() {
        System.out.println("tworzę pojazd " + color + " " + maxSpeed + " " + price + " " + waga + " " + czyMaSzyberdach);
    }

    Pojazd(String color, int maxSpeed, int price) {
        this(color, maxSpeed, price, (short) 80, false);
//        System.out.println("tworzę pojazd " + color + " " + maxSpeed + " " + price + " " + waga + " " + czyMaSzyberdach);
    }

    Pojazd(String color, int maxSpeed, int price, short waga, boolean czyMaSzyberdach) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.waga = waga;
        this.czyMaSzyberdach = czyMaSzyberdach;
        System.out.println("tworzę pojazd " + color + " " + maxSpeed + " " + price + " " + waga + " " + czyMaSzyberdach);
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void startEnginee() {
        System.out.println("uruchamian silnik");
        Random rnd = new Random();
        rnd.nextInt(10);
    }


    void stopEnginee() {
        System.out.println("wyłączam silnik");
    }

    int getNumOfWheels() {
        return NUM_OF_WHEELS;
    }

    void setNumOfWheels(int value) {
        NUM_OF_WHEELS = value;
    }

    static String podajNumOfWheels() {
        return "Mam " + NUM_OF_WHEELS + " koła";
    }

    public String toString() {
        return "color: " + color + "; maxSpeed: " + maxSpeed + "; price: " + price;
    }
}
