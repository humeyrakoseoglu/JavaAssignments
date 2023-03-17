package OtherPackageForQ11;

import Question11.KolSaati;

public class Test {
    public static void main(String[] args) {
        KolSaati kolSaati = new KolSaati();
        // doğrudan erişim yapılamaz
        // kolSaati.saat = 17;  // hata verir
        // metodlar aracılığıyla erişim sağlanabilir kolSaati.saatiAyarla(17)
        kolSaati.saatiAyarla(17);
        kolSaati.dakikayiAyarla(45);
        kolSaati.saniyeyiAyarla(30);
        System.out.println("Saat: " + kolSaati.getSaat() + ", Dakika: " + kolSaati.getDakika() + ", Saniye: " + kolSaati.getSaniye());

        AkilliKolSaati akıllıKolSaati = new AkilliKolSaati();
        akıllıKolSaati.zamaniAyarla(22, 25, 65);
        System.out.println("Saat: " + akıllıKolSaati.getSaat() + ", Dakika: " + akıllıKolSaati.getDakika() + ", Saniye: " + akıllıKolSaati.getSaniye());
    }
}
