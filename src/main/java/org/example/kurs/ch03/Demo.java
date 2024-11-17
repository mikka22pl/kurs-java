package org.example.kurs.ch03;

class Jakas {
    Integer a = 5;

    public Jakas(Integer a) {
        this.a = a;
    }
    public void wypisz() {
        System.out.println(a);
    }
}

public class Demo {


    public static void main(String[] args) {

        int a = 3;
        Integer n1 = null;
        Integer number = 3;
        Integer number2 = Integer.valueOf(4);
        Integer number3 = Integer.valueOf("123");

        System.out.println(number + " " + number2 + " " + number3);

        int compared = number2.compareTo(number); /// -1  0  1
        System.out.println(compared);

        Integer a1 = 102;
        Jakas j1 = new Jakas(a1);
        j1.wypisz();

        Boolean b1 = Boolean.FALSE;
        Boolean b2 = Boolean.TRUE;
        Boolean b3 = null;

        String s1 = null;
    }
}
