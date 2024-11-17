package org.example.kurs.ch05;

import java.util.List;
import java.util.Random;

public class Tank {

    protected Random rnd = new Random();
    int pancerz;
    int celnosc;
    boolean active;

    public Tank(int pancerz, int celnosc) {
        System.out.println("constructor Tank");
        this.pancerz = pancerz;
        this.celnosc = celnosc;
        active = true;
    }

    void strzela(Tank tank) {
        if (!active || !tank.active) {
            return;
        }
//        if (active && tank.active) {
        System.out.print(this + " strzela do " + tank);
        int tmp = rnd.nextInt(100) + 1; // 1-100
        if (tmp < celnosc) {
            System.out.println(" trafienie");
            tank.trafiony();
        } else {
            System.out.println(" pudło");
        }
//        }
    }

    void strzela(List<Tank> tanks) {
        for (Tank tank : tanks) {
            if (!tank.equals(this)) {
                strzela(tank);
            }
        }
    }

    void trafiony() {
        pancerz = pancerz - 1; // pancerz -= 1; pancerz--;

        if (pancerz < 1) {
            System.out.println("Czołg został " + this + " zniszczony!");
            active = false;
        }

    }

    void status() {
        String status = active ? "aktywny" : "zniszczony";
        System.out.println(this + " " + status + "; pancerz: " + pancerz);
    }

    @Override
    public String toString() {
        return "tank";
    }
}
