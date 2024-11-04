package pl.ulv.kurs.java.ch01;

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

        Pojazd p1 = new Pojazd("blue", 220, 100000);
        String colorP1 = p1.getColor();
        System.out.println(colorP1);
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        System.out.println(p1.getNumOfWheels());
        p1.setNumOfWheels(5);
        System.out.println(p1.getNumOfWheels());
        System.out.println(Pojazd.podajNumOfWheels());
        p1.setColor("black");
        System.out.println(p1.getColor());


        /*System.out.println("Pojazd 1: (1 - uruchom silnik; 2 - zgaś silnik; any key - exit) ");
        boolean running = true;
        while (running) {
            Scanner sc = new Scanner(System.in);
//            String komenda = String.valueOf(sc.nextInt());
            String komenda = sc.next();

            if ("1".equals(komenda)) {
                p1.startEnginee();
            } else if ("2".equals(komenda)) {
                p1.stopEnginee();
            } else {
                running = false;
            }
        }*/

        Pojazd p2 = new Pojazd("red", 245, 130000);
        p2.startEnginee();
        p2.stopEnginee();
        System.out.println(p2.getNumOfWheels());

        Pojazd p3 = new Pojazd();
        Pojazd p4 = new Pojazd();

        if (p3.equals(p4)) {
            System.out.println("p3 == p4");
        } else {
            System.out.println("p3 != p4");
        }

        System.out.println(p3);
        System.out.println(p4);

        SportCar sc1 = new SportCar();
        sc1.startEnginee();
        sc1.startEnginee();
        System.out.println(sc1);

        Bike rower = new Bike();
        System.out.println(rower.getNumOfWheels());
        rower.startEnginee();
    }
}