package org.example.kurs.ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListDemo {

    public static void main(String[] args) {
        /*
        ArrayList
        0
        1
        2
        3
        4

        LinkedList

        []- -[]- -[]-

         */

        List<String> list3 = new LinkedList<>();
        list3.add("1");
        list3.add("2");
        list3.add("3");

        String s = list3.get(1);
        System.out.println(s);


        /*List<String> list = new ArrayList<>();

        list.add("item 1");
        list.add("item 2");
        list.add("item 3");


        for (String str : list) {
            System.out.println(str);
        }

        String drugi = list.get(1);

        System.out.println(drugi + " " + list.size() + " ");
        list.remove(1);
        for (String str : list) {
            System.out.println(str);
        }*/




        MyList list = new MyList();
        list.add("item 1");
        list.add("item 2");

        int length = list.size();
        System.out.println("length = " + length);

        for (int i = 0; i < length; i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);
        length = list.size();
        System.out.println("length = " + length);








    }

    static class My2List<T> extends ArrayList<T> {
        @Override
        public T remove(int index) {
            System.out.println("nie działa");
            return null;
        }
    }
}
