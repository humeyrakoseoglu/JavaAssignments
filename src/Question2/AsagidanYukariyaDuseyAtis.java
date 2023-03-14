package Question2;


public class AsagidanYukariyaDuseyAtis implements  Atis{
    private final double YERCEKIMI = 10;

    @Override
    public double hiziHesapla(int Vo, int t) {
        //double yukseklik = (Vo * t) - (0.5 * yerCekimi * Math.pow(t,2));
        //double hiz = Math.sqrt(Math.pow(Vo,2) - 2 * yerCekimi * yukseklik);
        double hiz= Math.abs(Vo - YERCEKIMI * t);
        return hiz;
    }
}