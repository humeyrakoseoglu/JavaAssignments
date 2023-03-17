package Question6;

import java.util.ArrayList;

/*
https://app.patika.dev/courses/java-102/nested
 */
public class Hastane {
    ArrayList<Doktor> doktorlar = new ArrayList<Hastane.Doktor>();
    static int toplamDoktorSayisi;
    public void doktorUret(String isim, String soyisim){
        Doktor doktor = new Doktor(isim,soyisim);
        doktorlar.add(doktor);
        toplamDoktorSayisi++;
    }

    public ArrayList<Doktor> getDoktorlar() {
        return doktorlar;
    }

    public void setDoktorlar(ArrayList<Doktor> doktorlar) {
        this.doktorlar = doktorlar;
    }

    class Doktor{
        private String adi;
        private String soyadi;

        public Doktor(String adi, String soyadi) {
            this.adi = adi;
            this.soyadi = soyadi;
        }

        public String getAdi() {
            return adi;
        }

        public void setAdi(String adi) {
            this.adi = adi;
        }

        public String getSoyadi() {
            return soyadi;
        }

        public void setSoyadi(String soyadi) {
            this.soyadi = soyadi;
        }

        public void doktoruYazdir(){
            System.out.println("Doktorun adı: "+ getAdi() +" doktorun soyadi: " + getSoyadi() );
        }

    }
}
