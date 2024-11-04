package pl.ulv.kurs.java.ch06;

public class Merkava extends Tank {

    int pancerzReaktywny = 2;

    public Merkava(int pancerz, int celnosc) {
        super(pancerz, celnosc, 80);
    }

    @Override
    void trafiony() {
        if (pancerzReaktywny > 0) {
            System.out.println("....................... merkava pancerz reaktywny " + pancerzReaktywny);
            pancerzReaktywny--;
        } else {
            super.trafiony();
        }
    }

    @Override
    public String toString() {
        return "merkava";
    }
}
