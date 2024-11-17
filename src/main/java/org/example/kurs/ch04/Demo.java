package org.example.kurs.ch04;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("item 1");
        lista.add("item 2");
        lista.add("item 3");

        System.out.println(lista);

        lista.add("item 4");

        System.out.println(lista);

        String s1 = lista.get(0); /// pierwsza pozycja

        String s2 = lista.get(1);

        System.out.println("pierwsza pozycja: " + s1);

        boolean contains = lista.contains("item 6");

        System.out.println(contains);

        System.out.println("rozmiar: " + lista.size());


        for (int i = 0; i<lista.size();i++) {
            System.out.println("-- " + i + " : " + lista.get(i));
        }
    }
}
