package pl.ulv.kurs.java.ch06;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Warszawa", "Polska");
        map.put("Berlin", "Niemcy");
        map.put("Praha", "Czechy");

        System.out.println(map);

        Map<String, Tank> tankMap = new HashMap<>();
        tankMap.put("abrams", new Abrams(2, 20));
        tankMap.put("k2", new K2(2, 20));
        tankMap.put("t90", new T90(2, 20));

        System.out.println(tankMap);

        Tank ak2 = tankMap.get("k2");
        ak2.status();

        System.out.println(tankMap.entrySet());

        System.out.println(tankMap.containsKey("abrams"));
        System.out.println(tankMap.containsKey("prototype"));


        /*Tank abrams = new Abrams(3, 40);
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

        for (int i = 0; i < tanks.size(); i++) {
            tanks.get(i).status();
        }*/
    }
}
