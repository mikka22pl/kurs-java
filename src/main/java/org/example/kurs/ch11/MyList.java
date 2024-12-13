package org.example.kurs.ch11;

public class MyList {

    int size;
    String[] array = new String[10];

    // 0 1 2 3 4 5 6
    // [][][][][][][]
    // null, null, null....


    public void add(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                size++;
                break;
            }
        }
    }

    public String get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        array[index] = null;
        size--;
    }
}
