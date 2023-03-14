package Question5;

import java.util.ArrayList;
/*
https://app.patika.dev/courses/java-102/nested
 */
public class Hastane {
    private ArrayList<Doktor> doktorlar = new ArrayList<Doktor>();

    public void doktorEkle(Doktor doktor){
        doktorlar.add(doktor);
    }

    public void doktorlariGoruntule(){
        for(int i = 0; i < doktorlar.size(); i++){
            doktorlar.get(i).doktoruYazdir();
        }
    }

    class Doktor{
        private String adi;
        private String soyadi;

        public Doktor(String adi, String soyadi) {
            this.adi = adi;
            this.soyadi = soyadi;
        }

        public void doktoruYazdir(){
            System.out.println("Doktorun adı: "+ adi +" doktorun soyadi: " + soyadi );
        }

    }
}
