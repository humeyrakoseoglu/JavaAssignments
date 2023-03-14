package Question2;

public class YukaridanAsagiyaDuseyAtis implements  Atis{
    private final double YERCEKIMI = 10;

    @Override
    public double hiziHesapla(int Vo, int t) { // Vo: cismin ilk hızı  t: geçen süre
        double hiz= Vo + YERCEKIMI * t;
        return hiz;
    }
}
