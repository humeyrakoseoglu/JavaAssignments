package OtherPackageForQ11;

import Question11.KolSaati;

public class Test {
    public static void main(String[] args) {
        KolSaati saat = new KolSaati();
        saat.saatiAyarla(17);
        saat.dakikayiAyarla(45);
        saat.saniyeyiAyarla(30);
        System.out.println("Saat: " + saat.getSaat() + ", Dakika: " + saat.getDakika() + ", Saniye: " + saat.getSaniye());

        AkilliKolSaati akıllıKolSaati = new AkilliKolSaati();
        akıllıKolSaati.zamaniAyarla(22, 25, 65);
        System.out.println("Saat: " + akıllıKolSaati.getSaat() + ", Dakika: " + akıllıKolSaati.getDakika() + ", Saniye: " + akıllıKolSaati.getSaniye());
    }
}
