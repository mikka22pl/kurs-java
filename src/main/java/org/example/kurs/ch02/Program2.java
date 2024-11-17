package org.example.kurs.ch02;

import org.example.kurs.ch01.Pojazd;

import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        int[] tablicaInt = new int[3];
        tablicaInt[0] = 1;
        tablicaInt[1] = 3;
        tablicaInt[2] = 5;

        int[] tablica2 = {2, 4, 6, 8};

        System.out.println(tablicaInt[1]);

        System.out.println(tablica2[1]);
        System.out.println(tablica2.length);
        System.out.println(tablica2);

        Pojazd[] garaz = {
                new Pojazd(),
                new Pojazd(),
                new Pojazd()
        };

        for (int i = 0; i < tablica2.length; i++) {
            System.out.println(tablica2[i]);
        }

        String[] generated = new String[3];
        Random rnd = new Random();

        for (int i = 0; i < generated.length; i++) {
            generated[i] = String.valueOf(rnd.nextInt());
        }

        for (int i = 0; i < generated.length; i++) {
            System.out.println(generated[i]);
        }


        int[][] matrix = new int[3][3];

        int[][] matrix2 = {
                {1, 2, 3, 7},
                {2, 4, 6, 8},
                {3, 5, 9, 11}
        };

        System.out.println("z jednego " + matrix2[1][3]);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][0] + ",");
            }
            System.out.println();
        }

    }
}
