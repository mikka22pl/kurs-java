package pl.ulv.kurs.java.ch05;

public class Merkava extends Tank {

    public Merkava(int pancerz, int celnosc) {
        super(pancerz, celnosc);
    }

    @Override
    public String toString() {
        return "merkava";
    }
}