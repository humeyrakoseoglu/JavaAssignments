package Question8;

public class Ucgen extends Sekil{
    private int tabanAlani, yukseklik;

    public Ucgen(String renk, int tabanAlani, int yukseklik) {
        super(renk);
        this.yukseklik = yukseklik;
        this.tabanAlani = tabanAlani;
    }

    @Override
    public double cevreHesapla() {
        double kenar = (int)Math.sqrt(Math.pow(tabanAlani/2,2) + Math.pow(yukseklik,2));
        return tabanAlani + 2 * kenar; //ikizkenar veya eşkenar olarak dusunup pisagordan yaptım
    }

    @Override
    public double alanHesapla() {
        return tabanAlani * yukseklik /2 ;
    }
}
