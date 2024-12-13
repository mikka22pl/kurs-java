package org.example.kurs.ch11;

import java.util.Random;

public class Chars {
    Random rnd = new Random();

    public static void main(String[] args) {


        String znakiSpecjalne = "!@#$%^&*()_+=-}{[]:;<>.,?";

        char c = 'a';

        for (int i = 0; i < 200; i++) {
            System.out.println(i + " " + (char) i);
        }

        Chars chars = new Chars();
        char litera = (char) (chars.rnd.nextInt(26) + 'a');

        char bigLetter = (char) (chars.rnd.nextInt(26) + 'A');

        int number = chars.rnd.nextInt(10);
        int index = chars.rnd.nextInt(znakiSpecjalne.length());
        char znak = znakiSpecjalne.charAt(index);
        System.out.println(litera + " " + bigLetter + " " + number + " " + znak);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int choice = chars.rnd.nextInt(4);
            char letter;
            if (choice == 0) {
                letter = (char) (chars.rnd.nextInt(26) + 'a');
            } else if (choice == 1) {
                letter = (char) (chars.rnd.nextInt(26) + 'A');
            } else if (choice == 2) {
                letter = (char) (chars.rnd.nextInt(10) + 48);
            } else {
                int index2 = chars.rnd.nextInt(znakiSpecjalne.length());
                letter = znakiSpecjalne.charAt(index2);
            }
            sb.append(letter);
        }

        System.out.println(sb.toString());


    }
}
