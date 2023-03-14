package OtherPackageForQ11;

import Question11.KolSaati; ////24lük saat dilimine göre

public class AkilliKolSaati extends KolSaati {
    public void zamaniAyarla(int saat, int dakika, int saniye) {
        if (saat >= 0 && saat <= 24) {
            saatiAyarla(saat);
        } else {
            System.out.println("Saat için geçersiz saat değeri. " + saat);
        }
        if ( 0 <= dakika && dakika<=59) {
            dakikayiAyarla(dakika);
        }else{
            System.out.println("Dakika için geçersiz bir değer girdiniz.");
        }
        if (saniye >= 0 && saniye <= 59) {
            saniyeyiAyarla(saniye);
        }else{
            System.out.println("Saniye için geçersiz bir değer girdiniz.");
        }
    }
}
