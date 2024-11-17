package org.example.kurs.ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tank {

    protected Random rnd = new Random();

    private int pancerz;
    private int celnosc;
    private int ukrywanie;
    private boolean active;

    public Tank(int pancerz, int celnosc, int ukrywanie) {
        System.out.println("constructor Tank");
        this.pancerz = pancerz;
        this.celnosc = celnosc;
        this.ukrywanie = ukrywanie;
        active = true;
    }

    protected int getPancerz() {
        return pancerz;
    }

    protected int getCelnosc() {
        return celnosc;
    }

    protected int getUkrywanie() {
        return ukrywanie;
    }

    protected boolean isActive() {
        return active;
    }

    void seek(Tank tank) {
        int tmp = rnd.nextInt(100) + 1;
        if (tmp >= tank.ukrywanie) {
            strzela(tank);
        }
    }

    void seekAndDestroy(List<Tank> tanks) {
        // TODO: dodac ograniczenie by tylko jeden czolg wyszukac
        List<Tank> toFind = new ArrayList<>();

        for (Tank tank : tanks) {
            if (!this.equals(tank) && tank.active) {
                toFind.add(tank);
//                seek(tank);
            }
        }

        if (toFind.size() > 0) {
            int tmp = rnd.nextInt(toFind.size());
            seek(toFind.get(tmp));
        }
    }

    void strzela(Tank tank) {
        if (!active) {
            return;
        }
        System.out.print(this + " strzela do " + tank);
        int tmp = rnd.nextInt(100) + 1; // 1-100
        if (tmp < celnosc) {
            System.out.println(" trafienie");
            tank.trafiony();
        } else {
            System.out.println(" pudło");
        }
    }

    void strzela(List<Tank> tanks) {
        for (Tank tank : tanks) {
            if (!tank.equals(this)) {
                strzela(tank);
            }
        }
    }

    void trafiony() {
        System.out.println("......... trafiony() " + this);
        pancerz = pancerz - 1; // pancerz -= 1; pancerz--;

        if (pancerz < 1) {
            System.out.println("Czołg został " + this + " zniszczony!");
            active = false;
        }
    }

    void status() {
        String status = active ? "aktywny" : "zniszczony";
        System.out.println(this + " " + status + "; pancerz: " + pancerz + "; celnosc: " + celnosc);
    }

    @Override
    public String toString() {
        return "tank";
    }
}
