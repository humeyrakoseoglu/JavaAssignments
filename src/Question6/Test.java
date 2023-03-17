package Question6;

public class Test {
    public static void main(String[] args) {
        Hastane hastane = new Hastane();

        hastane.doktorUret("Ela", "Altindag");
        hastane.doktorUret("Suat", "Birtan");
        hastane.doktorUret("Arslan", "Ibrahimoglu");
        hastane.doktorUret("Zenan", "Parlar");

        for(int i = 0; i < hastane.getDoktorlar().size(); i++){
            hastane.getDoktorlar().get(i).doktoruYazdir();
        }
        System.out.println("Toplam doktor sayısı: " + hastane.toplamDoktorSayisi);
    }

}
