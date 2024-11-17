package org.example.kurs.ch06;

public class T90 extends Tank {

    public T90(int pancerz, int celnosc) {
        super(pancerz, celnosc, 65);
    }

    @Override
    void seek(Tank tank) {
        int tmp = rnd.nextInt(100) + 1;
        if (tmp >= tank.getUkrywanie()) {
            strzela(tank);
        }
    }

    @Override
    public String toString() {
        return "t90";
    }
}
