package pl.ulv.kurs.java.ch05;

public class Abrams extends Tank {
    public Abrams(int pancerz, int celnosc) {
        super(pancerz, celnosc);
        System.out.println("constructor Abrams");
    }

    @Override
    public String toString() {
        return "abrams";
    }
}