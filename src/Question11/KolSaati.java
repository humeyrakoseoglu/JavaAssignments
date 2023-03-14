package Question11;

public class KolSaati { //12lik saat dilimine göre
    private int saat;
    private int dakika;
    private int saniye;

    public void saatiAyarla(int saat){
        if ( 1<= saat && saat<=12) {
            this.saat = saat;
        }else if(saat > 12 && saat <= 23){
            this.saat = saat % 12;
        }
        else{
            System.out.println("Geçersiz bir değer girdiniz:");
        }

    }

    public void dakikayiAyarla(int dakika){
        if ( 0 <= dakika && dakika<=59) {
            this.dakika = dakika;
        }else{
            System.out.println("Geçersiz bir değer girdiniz:");
        }
    }

    public void saniyeyiAyarla(int saniye){
        if (saniye >= 0 && saniye <= 59) {
            this.saniye = saniye;
        }else{
            System.out.println("Geçersiz bir değer girdiniz:");
        }
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getDakika() {
        return dakika;
    }

    public void setDakika(int dakika) {
        this.dakika = dakika;
    }

    public int getSaniye() {
        return saniye;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }
}
