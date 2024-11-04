package pl.ulv.kurs.java.ch06;

public class Abrams extends Tank {
    public Abrams(int pancerz, int celnosc) {
        super(pancerz, celnosc, 50);
        System.out.println("constructor Abrams");
    }

    @Override
    void seek(Tank tank) {
        int tmp = rnd.nextInt(100) + 1 + 20;
        if (tmp >= tank.getUkrywanie()) {
            strzela(tank);
        }
    }

    @Override
    public String toString() {
        return "abrams";
    }
}
