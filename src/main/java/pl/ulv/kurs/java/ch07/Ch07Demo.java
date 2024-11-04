package pl.ulv.kurs.java.ch07;

import java.util.Objects;

class KlasaA {
    private int a;

    KlasaA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "KlasaA{" +
                "a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlasaA klasaA = (KlasaA) o;
        return a == klasaA.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }

}

class KlasaB {
    int b;

    @Override
    public String toString() {
        return "KlasaB{" +
                "b=" + b +
                '}';
    }
}

public class Ch07Demo {
    public static void main(String[] args) {
        KlasaA a1 = new KlasaA(4);
        KlasaA a2 = a1;
        KlasaA a3 = new KlasaA(4);

        System.out.println("a1 equals a2 => " + a1.equals(a2));
        System.out.println("a1 equals a3 => " + a1.equals(a3));
        System.out.println("a1 == a2 => " + (a1 == a2));
        System.out.println("a1 == a3 => " + (a1 == a3));
        a2.setA(1);
        System.out.println("a1 => " + a1);
        System.out.println("a2 => " + a2);
        System.out.println("a3 => " + a3);

        System.out.println("a1.hashCode() = " + a1.hashCode());
        System.out.println("a2.hashCode() = " + a2.hashCode());
        System.out.println("a3.hashCode() = " + a3.hashCode());

        char c = 65535;
        for (int i = 0; i < 500; i++) {
            System.out.println("char " + i + " value => "  + (char) i);
        }
        System.out.println(c);
        System.out.println('\u0446');

        byte d = 3;
        short e = 4;

        System.out.println((byte) e);

        // break;
        // continue;
        // return;

        // Overloading
        // override
        
    }

}
