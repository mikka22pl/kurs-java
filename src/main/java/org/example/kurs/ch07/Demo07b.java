package org.example.kurs.ch07;

public class Demo07b {

    public static void main(String[] args) {


        String s1 = "Siała baba mak";

        System.out.println(s1.indexOf('b'));
        System.out.println(s1.substring(2, 5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(3));

        String s2 = "prostokat:334343";
        System.out.println(s2.substring(0, s2.indexOf(':')));
        String parametry = s2.substring(s2.indexOf(':') + 1);
        System.out.println(parametry);
        if (parametry.contains(",")) {
            System.out.println("kilka parametrow");
            int i = parametry.indexOf(',');// 345,3
            int a1 = Integer.parseInt(parametry.substring(0, i));
            int b1 = Integer.parseInt(parametry.substring(i + 1));

            System.out.println("a1 = " + a1);
            System.out.println("b1 = " + b1);
        } else {
            System.out.println("jeden parametr " + parametry);
        }

    }
}
