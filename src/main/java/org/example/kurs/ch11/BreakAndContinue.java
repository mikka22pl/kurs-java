package org.example.kurs.ch11;

public class BreakAndContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            // 1 / 2 = 0.5
            // 1 % 2 = 5
            // 2 % 2 = 1.0 => 0
            // 4 % 2 = 2.0 => 0
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
