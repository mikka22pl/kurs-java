package pl.ulv.kurs.java.ch06;

import java.util.List;

public class Ch06Demo {
    public static void main(String[] args) {

        Tank abrams = new Abrams(3, 40);
        Tank merkava = new Merkava(2, 50);
        Tank t90 = new T90(3, 30);
        Tank k2 = new K2(4, 42);
        Tank prototype = new Tank(4, 40, 40);

        List<Tank> tanks = List.of(
                abrams,
                merkava,
                t90,
                k2,
                prototype
        );


        boolean running = true;
        int counter = 0;
        while (running) {
            int numOfActive = tanks.size();
            for (Tank tank : tanks) {
                if (tank.isActive()) {
                    tank.seekAndDestroy(tanks);
//                    tank.strzela(tanks);
                }
                if (!tank.isActive()) {
                    numOfActive--;
                }
            }
            if (numOfActive == 1) {
                running = false;
            }
            counter++;
        }

        System.out.println("-------------------------");
        System.out.println("--- counter: " + counter);
        tanks.forEach(t -> t.status());
    }
}
