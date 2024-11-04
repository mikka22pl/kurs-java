package pl.ulv.kurs.java.ch06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> unikalne = new HashSet<>();

        unikalne.add("warszawa");
        unikalne.add("berlin");
        unikalne.add("warszawa");

        System.out.println(unikalne);

        List<String> lista = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 200; i++) {
            lista.add("item " + rnd.nextInt());
        }
        System.out.println(lista);

    }
}
