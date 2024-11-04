package pl.ulv.kurs.java.ch01;

public class Bike extends Pojazd {
    static int NUM_OF_WHEELS = 2;

    @Override
    int getNumOfWheels() {
        return NUM_OF_WHEELS;
    }

    @Override
    void startEnginee() {
        System.out.println("nic nie robię");
    }
}
