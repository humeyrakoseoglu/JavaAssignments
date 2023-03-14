package Question6;

import java.util.ArrayList;

/*
https://app.patika.dev/courses/java-102/nested
 */
public class Hastane {
    ArrayList<Doktor> doktorlar = new ArrayList<Hastane.Doktor>();
    static int toplamDoktorSayisi;
    public void doktorUret(String isim, String soyisim){
        Doktor dr = new Doktor(isim,soyisim);
        doktorlar.add(dr);;
    }

    class Doktor{
        private String adi;
        private String soyadi;

        public Doktor(String adi, String soyadi) {
            this.adi = adi;
            this.soyadi = soyadi;
            toplamDoktorSayisi++;
        }

        public void doktoruYazdir(){
            System.out.println("Doktorun adı: "+ adi +" doktorun soyadi: " + soyadi );
        }

    }
}
