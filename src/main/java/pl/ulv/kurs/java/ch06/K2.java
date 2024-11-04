package pl.ulv.kurs.java.ch06;

public class K2 extends Tank {
    public K2(int pancerz, int celnosc) {
        super(pancerz, celnosc, 70);
    }

    @Override
    void seek(Tank tank) {
        // TODO: osobna metoda na sprawdzanie
        int tmp = rnd.nextInt(100) + 1;
        if (tmp >= tank.getUkrywanie()) {
            strzela(tank);
        }
    }

    @Override
    public String toString() {
        return "K2";
    }

}
