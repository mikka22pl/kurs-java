package org.example.kurs.ch05;

import java.util.List;

public class Ch05Demo {
    public static void main(String[] args) {

        Tank abrams = new Abrams(3, 40);
        Tank merkava = new Merkava(2, 50);
        Tank t90 = new T90(3, 30);
        Tank k2 = new K2(4, 42);

        List<Tank> tanks = List.of(
                abrams,
                merkava,
                t90,
                k2
        );

        boolean running = true;
        while (running) {
            for (Tank tank : tanks) {
                tank.strzela(tanks);
            }
            if (tanks.stream().filter(t -> t.active).count() == 1) {
                running = false;
            }
        }
        /*for (Tank tank : tanks) {
            tank.strzela(tanks);
        }
        for (Tank tank : tanks) {
            tank.strzela(tanks);
        }
        for (Tank tank : tanks) {
            tank.strzela(tanks);
        }*/
//        abrams.strzela(merkava);
//        merkava.strzela(t90);
//        t90.strzela(abrams);
//
//        abrams.strzela(t90);
//        merkava.strzela(abrams);
//        t90.strzela(merkava);

        System.out.println("-------------------------");
        tanks.forEach(t -> t.status());
//        for (Tank tank : tanks) {
//            tank.status();
//        }
//        for (int i = 0; i < tanks.size(); i++) {
//            tanks.get(i).status();
//        }
//
//        abrams.status();
//        t90.status();
//        merkava.status();
//        k2.status();
    }
}
