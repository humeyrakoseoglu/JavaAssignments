package Question6;

public class Test {
    public static void main(String[] args) {
        Hastane hastane = new Hastane();

        hastane.doktorUret("Ela", "Altindag");
        hastane.doktorUret("Suat", "Birtan");
        hastane.doktorUret("Arslan", "Ibrahimoglu");
        hastane.doktorUret("Zenan", "Parlar");
        System.out.println("Toplam doktor sayısı: " + hastane.toplamDoktorSayisi);
    }

}
