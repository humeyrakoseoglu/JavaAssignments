package Question8;

public class Dikdortgen extends Sekil{
    private int uzunKenar, kisaKenar;

    public Dikdortgen(String renk, int uzunKenar, int kisaKenar) {
        super(renk);
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunKenar+kisaKenar);
    }

    @Override
    public double alanHesapla() {
        return uzunKenar*kisaKenar;
    }
}
