package org.example.kurs.ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    int a = 0;
    int a2 = 3;
    byte b = 1;
    char c = 'a';
    short s = 2;
    long l = 3L;
    double d = 3.14;
    float f = 3.14f;
    boolean b2 = true;

    String s1 = "tekst";
    String s2 = new String("drugi tekst");
    Integer i1 = new Integer(2);
    Integer i2 = Integer.valueOf(12);
    Long l2 = Long.valueOf(12L);
    Character ch2 = Character.valueOf(c);
    Boolean b3 = Boolean.TRUE;

    DniTygodnia dzien = DniTygodnia.THURSDAY;
    DniTygodnia dzien2 = DniTygodnia.SUNDAY;


    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
        demo.arrays();
        demo.kolekcje();

    }

    private void start() {
        if (a == a2) {
            System.out.println("to samo");
        }
        boolean equals1 = i1.equals(i2);
        boolean equals2 = !equals1;
        if (equals2) { // == i1 != i2  => i1 is not i2 => ! false => true
            System.out.println("nie to samo");
        }
        int i1Comp = i1.compareTo(i2); // -1, 0, 1;

        if (!b2) { /// => b2 = false  => ! false => true;
            System.out.println("b2 == false");
        }

        char c1 = ch2.charValue();

        if (dzien != dzien2) {
            System.out.println("dzien != dzien2");
        }
    }


    private void arrays() {
        int[] inty = {1, 2, 3, 7, 8};

        Long[] longi = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L};

        String[] strings = {"abc", "def", "ghi"};

        DniTygodnia[] dni = DniTygodnia.values();

        System.out.println(inty);
        System.out.println(dni);

        System.out.println(longi[0]); // pierwszy elem
        System.out.println(longi[1]); // drugi elem
        longi[1] = 4L;
        System.out.println(longi[1]);

        for (DniTygodnia dzien : dni) {
            System.out.println("dzien " + dzien);
        }
        System.out.println("------------");
        for (int i = 0; i < dni.length; i++) {
            System.out.println("dzien " + dni[i]);

        }

    }


    private void kolekcje() {

        List<Object> intigers = List.of(1, 2, 5, 8, 9);
        List<Integer> ints2 = new ArrayList<>();
        ints2.add(1);
        ints2.add(2);
        ints2.add(3);
        ints2.add(4);

        ints2.addAll(List.of(9, 8, 7));

        intigers.forEach(System.out::println);
        System.out.println("--------");
        intigers.forEach(i -> {
            System.out.println(i);
        });
        System.out.println("--------");
        for(int i = 0; i < intigers.size(); i++) {
            System.out.println(intigers.get(i));
        }
        System.out.println("--------");
        int j = 0;
        while (j < intigers.size()) {
            System.out.println(intigers.get(j));
            j++;
        }

        System.out.println("--------");

        // key, value
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("jeden", 1);
        mapa.put("dwa", 2);
        mapa.put("trzy", 3);

        System.out.println(mapa);

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        List
                .of(new Mucha(), new Komar())
                .forEach(insekt -> insekt.fly());
    }

}
