package Question8;

abstract class Sekil {
    private String renk;

    public Sekil(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public abstract double cevreHesapla();
    public abstract double alanHesapla();

}
