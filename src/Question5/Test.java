package Question5;

public class Test {

    public static void main(String[] args) {
        Hastane hastane = new Hastane();
        Hastane.Doktor doktorEla = hastane.new Doktor("Ela", "Altindag");
        Hastane.Doktor doktorSuat =  hastane.new Doktor("Suat", "Birtan");
        Hastane.Doktor doktorArslan =  hastane.new Doktor("Arslan", "Ibrahimoglu");
        Hastane.Doktor doktorZenan =  hastane.new Doktor("Zenan", "Parlar");

        hastane.doktorEkle(doktorEla);
        hastane.doktorEkle(doktorSuat);
        hastane.doktorEkle(doktorArslan);
        hastane.doktorEkle(doktorZenan);

        // hastane.doktorlariGoruntule();
        for(int i = 0; i < hastane.getDoktorlar().size(); i++){
            hastane.getDoktorlar().get(i).doktoruYazdir();
        }
    }


}
